import React from "react";
import "./Teacher.css";

export class Teacher extends React.Component{

  constructor(){
    super();
    this.state = { studentRows: []};
  }

  componentWillMount(){
    var studentRows = [];
    this.props.route.students.forEach(function(person) {
      studentRows.push(
        <tr>
          <th scope="row">{person.id}</th>
          <td>{person.firstName}</td>
          <td>{person.lastName}</td>
          <td>{person.grade} %</td>
          <td>
            <form>
              <div className="form-inline">
                <input type="text" className="form-control" id="formGroupExampleInput2" placeholder="New Grade %"/>
                <button className="btn btn-default updateBtn"> Update</button>
              </div>
            </form>
          </td>
        </tr>
      );
    });
    this.setState({studentRows: studentRows})
  }

  render() {
    console.log(this.props);
    return(
      <div className="teacher-container">
        <table className="table">
          <thead>
            <tr>
              <th scope="col">Student #ID</th>
              <th scope="col">First Name</th>
              <th scope="col">Last Name</th>
              <th scope="col">Current Grade</th>
              <th scope="col">Update Grade</th>
            </tr>
          </thead>
          <tbody>
            {this.state.studentRows}
          </tbody>
        </table>
      </div>
    );
  }
}

export default Teacher;
