import React from "react";
import "./Student.css";

export class Student extends React.Component{
  render() {
    console.log(this.props);
    return(
      <div className="student-container">
        <div>
          <img className="student-pic"
             alt="Avatar"
             src="/avatar.jpg"/>
        </div>
        <table className="table">
          <thead>
            <tr>
              <th scope="col">Student #ID</th>
              <th scope="col">First Name</th>
              <th scope="col">Last Name</th>
              <th scope="col">Current Grade</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <th scope="row">{this.props.route.studentInfo.id}</th>
              <td>{this.props.route.studentInfo.firstName}</td>
              <td>{this.props.route.studentInfo.lastName}</td>
              <td>{this.props.route.studentInfo.grade} %</td>
            </tr>
          </tbody>
        </table>
      </div>
    );
  }
}

export default Student;