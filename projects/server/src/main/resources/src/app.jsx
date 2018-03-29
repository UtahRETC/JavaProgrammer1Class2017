import React, { Component } from "react";
import ReactDOM from "react-dom";
import axios from "axios";

const API_GET_STUDENTS = "/api/students";
const AVATARS = ["Cat", "GuineaPig", "Hippopotamus", "Horse", "Lion", "Rabbit"];

const getAvatar = person =>
  AVATARS[
    (person.firstName + person.lastName + person.id).length % AVATARS.length
  ];

const getAvatarUrl = person =>
  "url(/assets/images/" + getAvatar(person) + ".png)";

const Student = person => (
  <div className="flex items-center lh-copy">
    <div
      className="w2 h2 w3-ns h3-ns br-100 avatar"
      style={{ backgroundImage: getAvatarUrl(person) }}
    />
    <div className="pl3 flex-auto">
      <span className="f6 db black-70">Id: {person.id}</span>
      <span className="f6 db black-70">
        {person.firstName} {person.lastName}
      </span>
    </div>
    <div>
      <a className="f6 link blue hover-dark-gray">edit</a>
    </div>
  </div>
);

class StudentList extends Component {
  state = { students: [] };

  componentWillMount() {
    axios
      .get(API_GET_STUDENTS)
      .then(res => res.data)
      .then(students => this.setState({ students }));
  }

  render() {
    return (
      <article className="mt2 measure-wide center">
        <h1>Students Management System</h1>
        <ul className="list pl0 mt1 measure-wide">
          {this.state.students.map(student => (
            <li className="pa3 ph0-l bb b--black-10">{Student(student)}</li>
          ))}
        </ul>
      </article>
    );
  }
}

class App extends Component {
  render() {
    return <StudentList />;
  }
}

ReactDOM.render(<App />, document.getElementById("app"));
