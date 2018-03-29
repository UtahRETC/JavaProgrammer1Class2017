import React, { Component } from "react";
import ReactDOM from "react-dom";
import Modal from "react-modal";
import axios from "axios";

const API_GET_STUDENTS = "/api/students";

const EVENT_EDIT = "evedit";
const EVENT_DELETE = "evdelete";

const Avatars = {
  nextImage: 0,
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

  url() {
    return (
      "url(/assets/images/" +
      Avatars.images[Avatars.nextImage++ % Avatars.images.length] +
      ".png)"
    );
  },

  color() {
    return Avatars.colors[
      Math.floor((Math.random() * 100) % Avatars.colors.length)
    ];
  }
};

const Avatar = props => (
  <div
    className="w2 h2 w3-ns h3-ns br-100 ba b--dashed b--gray"
    style={{
      backgroundColor: Avatars.color(),
      backgroundImage: Avatars.url(),
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

const Student = (person, onClick) => (
  <div className="flex items-center lh-copy">
    <Avatar person={person} />

    <div className="pl3 flex-auto">
      <span className="f6 db black-70">Id: {person.id}</span>
      <span className="f6 db black-70">
        {person.firstName} {person.lastName}
      </span>
    </div>

    <Link onClick={() => onClick(EVENT_EDIT)}>edit</Link>
    <Link onClick={() => onClick(EVENT_DELETE)}>delete</Link>
  </div>
);

class StudentList extends Component {
  state = {
    students: [],
    creating: false,
    editing: null
  };

  componentWillMount() {
    this.fetchStudents();
  }

  fetchStudents() {
    axios
      .get(API_GET_STUDENTS)
      .then(res => res.data)
      .then(students => this.setState({ students }));
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

  render() {
    let { students, editing, creating } = this.state;

    return (
      <article className="mt4 measure-wide center">
        <h2 className="tc">Students Management System</h2>
        <ul className="list pl0 mt5 measure-wide">
          {students.map(student => (
            <li className="pa3 ph0-l bb b--black-10">
              {Student(student, ev => this.handleStudentEvent(ev, student))}
            </li>
          ))}
        </ul>

        <Modal isOpen={editing || creating}>{JSON.stringify(editing)}</Modal>
      </article>
    );
  }
}

ReactDOM.render(<StudentList />, document.getElementById("app"));
