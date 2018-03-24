import React from "react";
import { Link } from "react-router";
import "./Sidebar.css";

export class Sidebar extends React.Component {
  constructor() {
    super();
    this.state = {
      students: []
    };
  }

  componentDidMount() {
    this.fetchStudents();
  }

  fetchStudents = () => {
    return fetch(`/api/people`)
      .then(res => res.json())
      .then(body => {
        this.setState({
          students: body
        });
      });
  }

  render() {
    let studentsToRender = this.state.students;

    return (
      <nav className="sidenav">
        <Link to={"/"}>Home</Link>
        <div className="group-header">Students</div>
        {studentsToRender.map(student => (
          <Link
            key={student.id}
            className="student-link"
            to={"/student/" + student.id}
            activeStyle={{ color: "#BBB" }}
          >
            {student.firstName}
          </Link>
        ))}
        <div className="group-header">Teachers</div>
        <Link
          to={"/teacher/"}
          className="student-link"
          activeStyle={{ color: "#BBB" }}
        >
          Teacher
        </Link>
      </nav>
    );
  }
}

export default Sidebar;
