import React, { Component } from "react";
import ReactDOM from "react-dom";
import Modal from "react-modal";
import axios from "axios";

const EVENT_DELETE = "evdelete";
const EVENT_EDIT = "evedit";
const EVENT_EDIT_GRADE = "eveditgrade";

const Students = {
  endpoint: "/api/students",

  getAll() {
    return axios.get(this.endpoint);
  },

  getById(id) {
    return axios.get(`${this.endpoint}/${id}`);
  },

  update(student) {
    return axios.put(`${this.endpoint}/${student.id}`, {
      firstName: student.firstName,
      lastName: student.lastName
    });
  },

  updateGrade(student) {
    return axios.put(`${this.endpoint}/${student.id}/grade`, {
      grade: student.grade
    });
  },

  remove(student) {
    return axios.delete(`${this.endpoint}/${student.id}`, student);
  },

  create(student) {
    return axios.post(this.endpoint, student);
  },

  isStudent(thing) {
    if (typeof thing === "string") {
      try {
        thing = JSON.parse(thing);
      } catch (err) {
        return false;
      }
    }

    return (
      "id" in thing &&
      "grade" in thing &&
      "firstName" in thing &&
      "lastName" in thing
    );
  }
};

const Avatars = {
  images: ["Cat", "GuineaPig", "Hippopotamus", "Horse", "Lion", "Rabbit"],
  colors: [
    "#a2d9ce",
    "#a3e4d7",
    "#d4efdf",
    "#e5e8e8",
    "#e6b0aa",
    "#e8daef",
    "#f9e79f",
    "#fadbd8",
    "#fae5d3",
    "#fdf2e9"
  ],

  url(student) {
    return "url(/assets/images/" + this.image(student) + ".png)";
  },

  image(student) {
    return this.images[parseInt(student.id) % this.images.length];
  },

  color(student) {
    return this.colors[parseInt(student.id) % this.colors.length];
  }
};

const Avatar = props => (
  <div
    className="w2 h2 w3-ns h3-ns br-100 ba b--dashed b--gray"
    style={{
      backgroundColor: Avatars.color(props.student),
      backgroundImage: Avatars.url(props.student),
      backgroundPositionX: "50%",
      backgroundPositionY: "3px",
      backgroundRepeat: "no-repeat",
      backgroundSize: "110%"
    }}
  />
);

const Code = props => (
  <code>
    <pre
      style={{
        background: "#f3f3f3",
        padding: ".75rem",
        border: "1px solid #dadada",
        whiteSpace: "pre-wrap",
        maxHeight: "300px",
        overflow: "auto"
      }}
    >
      {props.children}
    </pre>
  </code>
);

const Separator = props => (
  <span className="ml2" {...props}>
    /
  </span>
);

const Link = props => (
  <a className="f6 link blue hover-dark-gray pointer ml2" {...props}>
    {props.children}
  </a>
);

const Button = props => {
  let { bgColor, fgColor, ...rest } = props;

  return (
    <a
      className={[
        "f6 link dim br1 ph3 pv2 mt2 mr2 dib pointer",
        bgColor || "bg-dark-blue",
        fgColor || "white"
      ].join(" ")}
      {...rest}
    >
      {props.children}
    </a>
  );
};

const CancelButton = props => (
  <Button fgColor="dark-gray" bgColor="bg-white" {...props}>
    Cancel
  </Button>
);

class Field extends Component {
  render() {
    let { required, label, value, inputRef } = this.props;
    let id = "fieldId" + Math.random().toString();

    let info = required ? (
      <span className="normal black-60">(required)</span>
    ) : (
      ""
    );

    return (
      <span>
        <label htmlFor={id} className="f6 b db mb2 mt3">
          {label} {info}
        </label>
        <input
          id={id}
          className="input-reset ba b--black-20 pa2 mb2 db w-100"
          type="text"
          defaultValue={value}
          ref={obj => (inputRef ? inputRef(obj) : null)}
        />
      </span>
    );
  }
}

const SchemeError = ({ got, expected }) => (
  <div>
    <h2 className="dark-red">HTTP Response Format Error</h2>
    <h4>
      An HTTP request was made but it came back with an unexpected response
      format.
    </h4>
    <p className="lh-copy">
      Make sure that your response is sending back the right information. I'm
      expecting something like this:
    </p>
    <Code>{JSON.stringify(expected, null, "  ")}</Code>
    <p className="lh-copy">But instead I got this:</p>
    <Code>{JSON.stringify(got, null, "  ")}</Code>
  </div>
);

const HttpError = ({ config, request, response }) => {
  let textSuggestion;
  let codeSuggestion;

  if (response.status >= 500) {
    if (response && response.data && response.data.stack) {
      textSuggestion = `This error suggests that there was a problem running
        part of the server code. Below you will find a stack trace of the
        exception that the server ran into. Make sure to pay close attention to
        lines that mention the "Main.java" file:`;

      codeSuggestion = response.data.stack;
    } else {
      textSuggestion = `This error suggests that there was a problem running
        part of the server code. Unfortunately I was not able get back any
        information about the error, so you will have to refer to the output in
        the server console.`;
    }
  } else if (response.status >= 404) {
    textSuggestion = `This error message suggests that the endpoint does not
      exists. Make sure it exists, there are no typos in the URL, and that you
      have the correct method. Finally, make sure to restart the server after
      your changes are complete. Below is a suggestion of what the code for
      this endpoint might look like. Keep in mind that this is only a
      suggestion and you will have to make changes:`;

    codeSuggestion = `${config.method.toLowerCase()}("${
      config.url
    }", (request, response) -> {
  // Your code goes here
});`;
  } else {
    if (response && response.data && response.data.stack) {
      textSuggestion = `Check the error output on the server console and make
        sure to restart the server after you make changes to your code. Below
        you will find a stack trace of the exception that the server ran into.
        Make sure to pay close attention to lines that mention the "Main.java"
        file:`;

      codeSuggestion = response.data.stack;
    } else {
      textSuggestion = `Check the error output on the server console and make
        sure to restart the server after you make changes to your code.`;
    }
  }

  return (
    <div>
      <h2 className="dark-red">HTTP Request Error</h2>
      <h4>
        There was an error making an HTTP request to <code>"{config.url}"</code>{" "}
        with a <code>"{config.method.toUpperCase()}"</code> method. The request
        came back with a status of{" "}
        <code>
          {response.status}, {response.statusText}
        </code>.
      </h4>
      {textSuggestion ? <p className="lh-copy">{textSuggestion}</p> : ""}
      {codeSuggestion ? <Code>{codeSuggestion}</Code> : ""}
    </div>
  );
};

const Student = (student, onClick) => (
  <div className="flex items-center lh-copy">
    <Avatar student={student} />

    <div className="pl3 flex-auto">
      <span className="f6 db black-70">Id: {student.id}</span>
      <span className="f6 db black-70">Grade: {student.grade}%</span>
      <span className="f6 db black-70">
        Name: {student.firstName} {student.lastName}
      </span>
    </div>

    <Link onClick={() => onClick(EVENT_EDIT_GRADE)}>Edit Grade</Link>
    <Separator />
    <Link onClick={() => onClick(EVENT_EDIT)}>Edit Student</Link>
    <Separator />
    <Link onClick={() => onClick(EVENT_DELETE)}>Delete</Link>
  </div>
);

class StudentList extends Component {
  state = {
    students: [],
    isCreating: false,
    lastUpdate: 0,
    editingGrade: null,
    editingStudent: null,
    reqErr: null,
    schemaErr: null
  };

  componentWillMount() {
    this.getAllStudents();
  }

  handleStudentEvent(ev, student) {
    switch (ev) {
      case EVENT_EDIT:
        this.setEditStudent(student);
        break;

      case EVENT_EDIT_GRADE:
        this.setEditStudentGrade(student);
        break;

      case EVENT_DELETE:
        this.deleteStudent(student);
        break;

      default:
        window.alert(`
          Warning: an unhandled event was captured (method:
          StudentList.handleStudentEvent).

          If you are getting this message it means there is an issue with the
          Web App for this assignment. Please take a screenshot of this message
          and report the issue (along with your screenshot) to the teachers at
          the next class. Thank you!
        `);
        break;
    }
  }

  setCreateStudent() {
    this.setState({
      isCreating: true
    });
  }

  setEditStudentGrade(student) {
    this.setState({
      editingGrade: student
    });
  }

  setEditStudent(student) {
    this.setState({
      editingStudent: student
    });
  }

  getAllStudents() {
    Students.getAll()
      .then(res => res.data.reverse())
      .then(students => this.setState({ students, lastUpdate: Date.now() }))
      .catch(reqErr => this.setState({ reqErr }));
  }

  deleteStudent(student) {
    let msg =
      `Are you sure you would like to delete ${this.getStudentName(
        student
      )}`.trim() + "?";

    if (window.confirm(msg)) {
      Students.remove(student)
        .then(() => this.getAllStudents())
        .catch(reqErr => this.setState({ reqErr }));
    }
  }

  updateStudent(student) {
    return Students.update(student)
      .catch(reqErr => this.setState({ reqErr }))
      .then(res => this.assertStudent(res.data))
      .then(() => this.getAllStudents());
  }

  updateStudentGrade(student) {
    return Students.updateGrade(student)
      .catch(reqErr => this.setState({ reqErr }))
      .then(res => this.assertStudent(res.data))
      .then(() => this.getAllStudents());
  }

  createStudent(student) {
    return Students.create(student)
      .catch(reqErr => this.setState({ reqErr }))
      .then(res => this.assertStudent(res.data))
      .then(() => this.getAllStudents());
  }

  assertStudent(data) {
    if (Students.isStudent(data)) {
      return true;
    }

    this.setState({
      schemaErr: {
        got: data,
        expected: {
          id: "<auto generated id>",
          grade: "<auto generated grade>",
          firstName: "<first name string value>",
          lastName: "<last name string value>"
        }
      }
    });

    return false;
  }

  getStudentName(student) {
    return [student.firstName, student.lastName].join(" ").trim();
  }

  closeStudentModal() {
    this.setState({
      editingGrade: null,
      editingStudent: null,
      isCreating: false
    });
  }

  closeErrorModal() {
    this.setState({
      reqErr: null,
      schemaErr: null
    });
  }

  render() {
    let firstNameRef, lastNameRef, gradeRef;
    let widths = "mw7 w-60-ns w-75-m w-90";

    let {
      students,
      editingGrade,
      editingStudent,
      isCreating,
      lastUpdate,
      reqErr,
      schemaErr
    } = this.state;

    let studentInfo = editingStudent || {};
    let studentsListElem = !students.length ? (
      <h4 className="mt4">
        There are no students to show. You can add new students by clicking on
        the "Create a new student" button above and filling out the form.
      </h4>
    ) : (
      <ul className="list pl0 mt4">
        {students.map(student => (
          <li key={student.id} className="pa3 ph0-l bb b--black-10">
            {Student(student, ev => this.handleStudentEvent(ev, student))}
          </li>
        ))}
      </ul>
    );

    let lastUpdateTime = new Date(lastUpdate).toTimeString();
    let lastUpdateMsgElem = (
      <div className="mt2 f7 normal black-60">
        Last student update: {lastUpdateTime}
      </div>
    );

    let errorModalElem =
      !reqErr && !schemaErr ? (
        <span />
      ) : (
        <Modal
          appElement={document.getElementById("app")}
          isOpen={true}
          shouldCloseOnOverlayClick={false}
          shouldCloseOnEsc={true}
          className={widths + " center mt4 pa4 bg-white ba b--gray outline-0-l"}
          onRequestClose={() => this.closeErrorModal()}
        >
          {reqErr && (
            <HttpError
              config={reqErr.config}
              request={reqErr.request}
              response={reqErr.response}
            />
          )}
          {schemaErr && (
            <SchemeError got={schemaErr.got} expected={schemaErr.expected} />
          )}
          <div className="tr mt3">
            <Button onClick={() => this.closeErrorModal()}>Close</Button>
          </div>
        </Modal>
      );

    let studentModalIsOpen = !!editingStudent || !!isCreating;
    let studentModalTitleElem = <span />;

    if (isCreating) {
      studentModalTitleElem = <span>Create a new student</span>;
    } else if (editingStudent) {
      studentModalTitleElem = (
        <span>Editing "{this.getStudentName(editingStudent)}"</span>
      );
    } else if (editingGrade) {
      studentModalTitleElem = (
        <span>Editing grade for "{this.getStudentName(editingGrade)}"</span>
      );
    }

    let studentModalSubmitAction = () => {
      if (!gradeRef && (!firstNameRef || !lastNameRef)) {
        window.alert(`
          Warning: unable to get a reference on input fields (method:
          render.studentModalSubmitAction).

          If you are getting this message it means there is an issue with the
          Web App for this assignment. Please take a screenshot of this message
          and report the issue (along with your screenshot) to the teachers at
          the next class. Thank you!
        `);

        return;
      }

      if (editingGrade) {
        this.updateStudentGrade({
          id: editingGrade.id,
          grade: gradeRef.value
        });
      } else if (editingStudent) {
        this.updateStudent({
          id: editingStudent.id,
          firstName: firstNameRef.value,
          lastName: lastNameRef.value
        });
      } else if (isCreating) {
        this.createStudent({
          firstName: firstNameRef.value,
          lastName: lastNameRef.value
        });
      }

      this.closeStudentModal();
    };

    let gradeInfo = editingGrade || {};
    let gradeModalIsOpen = !!editingGrade;
    let gradeModalElem = (
      <Modal
        appElement={document.getElementById("app")}
        isOpen={gradeModalIsOpen}
        shouldCloseOnOverlayClick={false}
        shouldCloseOnEsc={true}
        className={widths + " center mt4 pa4 bg-white ba b--gray outline-0-l"}
        onRequestClose={() => this.closeStudentModal()}
      >
        <div className="black-80">
          <h2 className="mt0">{studentModalTitleElem}</h2>

          <Field
            label="Grade"
            value={gradeInfo.grade}
            required={true}
            inputRef={ref => (gradeRef = ref)}
          />

          <div className="tr">
            <CancelButton onClick={() => this.closeStudentModal()} />
            <Button onClick={studentModalSubmitAction}>Submit</Button>
          </div>
        </div>
      </Modal>
    );

    let studentModalElem = (
      <Modal
        appElement={document.getElementById("app")}
        isOpen={studentModalIsOpen}
        shouldCloseOnOverlayClick={false}
        shouldCloseOnEsc={true}
        className={widths + " center mt4 pa4 bg-white ba b--gray outline-0-l"}
        onRequestClose={() => this.closeStudentModal()}
      >
        <div className="black-80">
          <h2 className="mt0">{studentModalTitleElem}</h2>

          <Field
            label="First Name"
            value={studentInfo.firstName}
            required={true}
            inputRef={ref => (firstNameRef = ref)}
          />
          <Field
            label="Last Name"
            value={studentInfo.lastName}
            required={true}
            inputRef={ref => (lastNameRef = ref)}
          />

          <div className="tr">
            <CancelButton onClick={() => this.closeStudentModal()} />
            <Button onClick={studentModalSubmitAction}>Submit</Button>
          </div>
        </div>
      </Modal>
    );

    return (
      <article className={widths + " mt4 pa2 center"}>
        <h2 className="mb4">Student Management System</h2>

        <Button onClick={() => this.getAllStudents()}>
          Refresh student list
        </Button>
        <Button onClick={() => this.setCreateStudent()}>
          Create a new student
        </Button>

        {studentsListElem}
        {lastUpdateMsgElem}
        {studentModalElem}
        {gradeModalElem}
        {errorModalElem}
      </article>
    );
  }
}

ReactDOM.render(<StudentList />, document.getElementById("app"));
