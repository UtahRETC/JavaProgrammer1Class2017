import React, { Component } from "react";
import ReactDOM from "react-dom";
import Modal from "react-modal";
import axios from "axios";

const API_GET_STUDENTS = "/api/students";

const EVENT_EDIT = "evedit";
const EVENT_DELETE = "evdelete";

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

  return <a
    className={[
      "f6 link dim br1 ph3 pv2 mt2 mr2 dib",
      bgColor || "bg-dark-blue",
      fgColor || "white"
    ].join(" ")}
    href="#0"
    {...rest}
  >
    {props.children}
  </a>
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
    lastUpdate: 0
  };

  componentWillMount() {
    this.fetchStudents();
  }

  fetchStudents() {
    axios
      .get(API_GET_STUDENTS)
      .then(res => res.data)
      .then(students => this.setState({ students, lastUpdate: Date.now() }));
  }

  handleStudentEvent(ev, student) {
    switch (ev) {
      case EVENT_EDIT:
        this.setState({ editing: student });
        break;

      case EVENT_DELETE:
        console.warn("Unimplemented event: %s", ev);
        break;

      default:
        console.error("Unknown event: %s", ev);
        break;
    }
  }

  createNewStudent() {
    this.setState({
      creating: true
    });
  }

  closeModal() {
    this.setState({
      editing: null,
      creating: false
    });
  }

  render() {
    let { students, editing, creating, lastUpdate } = this.state;

    let studentInfo = editing || {};
    let studentsListElem = (
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

    let modalIsOpen = !!editing || !!creating;
    let modalTitleElem = !editing ? (
      <span>Create a new student</span>
    ) : (
      <span>
        Editing {editing.firstName} {editing.lastName}
      </span>
    );

    let modalElem = (
      <Modal
        appElement={document.getElementById("app")}
        isOpen={modalIsOpen}
        shouldCloseOnOverlayClick={false}
        shouldCloseOnEsc={true}
        className="measure-wide center mt4 pa4 bg-white ba b--gray outline-0-l"
        onRequestClose={() => this.closeModal()}
      >
        <div>
          <form className="black-80">
            <h2 className="mt0">{modalTitleElem}</h2>

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
              <CancelButton onClick={() => this.closeModal()} />
              <Button>Submit</Button>
            </div>
          </form>
        </div>
      </Modal>
    );

    return (
      <article className="mt4 measure-wide center">
        <h2 className="mb4">Students Management System</h2>

        <Button onClick={() => this.fetchStudents()}>
          Refresh student list
        </Button>
        <Button onClick={() => this.createNewStudent()}>
          Create a new student
        </Button>

        {studentsListElem}
        {lastUpdateMsgElem}
        {modalElem}
      </article>
    );
  }
}

ReactDOM.render(<StudentList />, document.getElementById("app"));
