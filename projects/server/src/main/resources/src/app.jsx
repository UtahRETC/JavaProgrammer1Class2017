import React, { Component } from "react";
import ReactDOM from "react-dom";
import Modal from "react-modal";
import axios from "axios";

const EVENT_EDIT = "evedit";
const EVENT_DELETE = "evdelete";

const Students = {
  endpoint: "/api/students",

  getAll() {
    return axios.get(this.endpoint).then(res => res.data);
  },

  getById(id) {
    return axios.get(`${this.endpoint}/${id}`).then(res => res.data);
  },

  update(student) {
    return axios
      .put(`${this.endpoint}/${student.id}`, student)
      .then(res => res.data);
  },

  remove(student) {
    return axios
      .delete(`${this.endpoint}/${student.id}`, student)
      .then(res => res.data);
  },

  create(student) {
    return axios.post(this.endpoint, student).then(res => res.data);
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

  url(person) {
    return "url(/assets/images/" + this.image(person) + ".png)";
  },

  image(person) {
    return this.images[parseInt(person.id) % this.images.length];
  },

  color(person) {
    return this.colors[parseInt(person.id) % this.colors.length];
  }
};

const Avatar = props => (
  <div
    className="w2 h2 w3-ns h3-ns br-100 ba b--dashed b--gray"
    style={{
      backgroundColor: Avatars.color(props.person),
      backgroundImage: Avatars.url(props.person),
      backgroundPositionX: "50%",
      backgroundPositionY: "3px",
      backgroundRepeat: "no-repeat",
      backgroundSize: "110%"
    }}
  />
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

const Field = props => {
  let id = "fieldId" + Math.random().toString();
  let info = props.required ? (
    <span className="normal black-60">(required)</span>
  ) : (
    <span />
  );

  return (
    <span>
      <label htmlFor={id} className="f6 b db mb2 mt3">
        {props.label} {info}
      </label>
      <input
        id={id}
        className="input-reset ba b--black-20 pa2 mb2 db w-100"
        type="text"
        defaultValue={props.value}
      />
    </span>
  );
};

const HttpError = ({ config, request, response }) => {
  let textSuggestion;
  let codeSuggestion;

  if (response.status === 404) {
    textSuggestion =
      "That error message suggests that the endpoint does not exists. " +
      "Make sure it exists, there are no typos in the URL, and that " +
      "you have the correct method. Finally, make sure to restart the " +
      "server after your changes are complete. Below is a suggestion " +
      "of what the code for this endpoint might look like. Keep in mind " +
      "that this is only a suggestion and you will have to make changes:";

    codeSuggestion = `${config.method.toLowerCase()}("${
      config.url
    }", (request, response) -> {
  // Your code goes here
});`;
  } else if (response.status === 500) {
  } else {
    textSuggestion =
      "Check the error output on the server console and make sure to " +
      "restart the server after you make changes to your code.";
  }

  return (
    <div>
      <h2 className="dark-red">HTTP Error</h2>
      <h4>
        There was an error making an HTTP request to <code>"{config.url}"</code>{" "}
        with a <code>"{config.method.toUpperCase()}"</code> method. The request
        came back with a status of{" "}
        <code>
          {response.status}, {response.statusText}
        </code>.
      </h4>
      {textSuggestion ? <p className="lh-copy">{textSuggestion}</p> : ""}
      {codeSuggestion ? (
        <code>
          <pre>{codeSuggestion}</pre>
        </code>
      ) : (
        ""
      )}
    </div>
  );
};

const Student = (person, onClick) => (
  <div className="flex items-center lh-copy">
    <Avatar person={person} />

    <div className="pl3 flex-auto">
      <span className="f6 db black-70">Id: {person.id}</span>
      <span className="f6 db black-70">
        {person.firstName} {person.lastName}
      </span>
    </div>

    <Link onClick={() => onClick(EVENT_EDIT)}>Edit</Link>
    <Link onClick={() => onClick(EVENT_DELETE)}>Delete</Link>
  </div>
);

class StudentList extends Component {
  state = {
    students: [],
    creating: false,
    editing: null,
    reqErr: null,
    lastUpdate: 0
  };

  componentWillMount() {
    this.getAllStudents();
  }

  handleStudentEvent(ev, student) {
    switch (ev) {
      case EVENT_EDIT:
        this.setEditStudent(student);
        break;

      case EVENT_DELETE:
        this.deleteStudent(student);
        break;

      default:
        console.error("Unknown event: %s", ev);
        break;
    }
  }

  setCreateStudent() {
    this.setState({
      creating: true
    });
  }

  setEditStudent(student) {
    this.setState({
      editing: student
    });
  }

  getAllStudents() {
    Students.getAll()
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
      .then(() => this.getAllStudents())
      .catch(reqErr => this.setState({ reqErr }));
  }

  createStudent(student) {
    return Students.create(student)
      .then(() => this.getAllStudents())
      .catch(reqErr => this.setState({ reqErr }));
  }

  getStudentName(student) {
    return [student.firstName, student.lastName].join(" ").trim();
  }

  closeStudentModal() {
    this.setState({
      editing: null,
      creating: false
    });
  }

  closeErrorModal() {
    this.setState({
      reqErr: null
    });
  }

  render() {
    let { students, editing, creating, lastUpdate, reqErr } = this.state;

    let studentInfo = editing || {};
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

    let errorModalElem = !reqErr ? (
      <span />
    ) : (
      <Modal
        appElement={document.getElementById("app")}
        isOpen={true}
        shouldCloseOnOverlayClick={false}
        shouldCloseOnEsc={true}
        className="w-50 center mt4 pa4 bg-white ba b--gray outline-0-l"
        onRequestClose={() => this.closeErrorModal()}
      >
        <HttpError
          config={reqErr.config}
          request={reqErr.request}
          response={reqErr.response}
        />
        <div className="tr mt3">
          <Button onClick={() => this.closeErrorModal()}>Close</Button>
        </div>
      </Modal>
    );

    let studentModalIsOpen = !!editing || !!creating;
    let studentModalTitleElem = !editing ? (
      <span>Create a new student</span>
    ) : (
      <span>
        Editing {editing.firstName} {editing.lastName}
      </span>
    );

    let studentModalSubmitAction = () => {
      if (editing) {
        // TODO Pass real student object
        this.updateStudent({});
      } else {
        // TODO Pass real student object
        this.createStudent({});
      }

      this.closeStudentModal();
    };

    let studentModalElem = (
      <Modal
        appElement={document.getElementById("app")}
        isOpen={studentModalIsOpen}
        shouldCloseOnOverlayClick={false}
        shouldCloseOnEsc={true}
        className="w-50 center mt4 pa4 bg-white ba b--gray outline-0-l"
        onRequestClose={() => this.closeStudentModal()}
      >
        <div>
          <form className="black-80">
            <h2 className="mt0">{studentModalTitleElem}</h2>

            <Field
              label="First Name"
              value={studentInfo.firstName}
              required={true}
            />
            <Field
              label="Last Name"
              value={studentInfo.lastName}
              required={true}
            />

            <div className="tr">
              <CancelButton onClick={() => this.closeStudentModal()} />
              <Button onClick={studentModalSubmitAction}>Submit</Button>
            </div>
          </form>
        </div>
      </Modal>
    );

    return (
      <article className="mt4 measure-wide center">
        <h2 className="mb4">Students Management System</h2>

        <Button onClick={() => this.getAllStudents()}>
          Refresh student list
        </Button>
        <Button onClick={() => this.setCreateStudent()}>
          Create a new student
        </Button>

        {studentsListElem}
        {lastUpdateMsgElem}
        {studentModalElem}
        {errorModalElem}
      </article>
    );
  }
}

ReactDOM.render(<StudentList />, document.getElementById("app"));