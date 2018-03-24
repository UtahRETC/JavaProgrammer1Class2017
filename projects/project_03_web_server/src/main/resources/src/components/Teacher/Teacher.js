import React from "react";

import StateService from '../../services/StateService';
import "./Teacher.css";

export class Teacher extends React.Component {
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
    return fetch(`/api/students`)
      .then(res => res.json())
      .then(body => {
        this.setState({
          students: body
        });
      });
  }

  updateStudentGrade = (id, grade) => {
    fetch(`/api/students/${id}/grade`, {
      method: 'PUT',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ grade })
    })
      .then(res => {
        if (res.status === 200) {
          return Promise.resolve();
        } else {
          return Promise.reject(new Error('Error updating the student grade'));
        }
      })
      .then(() => this.fetchStudents())
      .catch(err => {
        console.error('TODO: Handle this error!!!', err);
      });
  }

  addStudent = (firstName, lastName) => {
    fetch(`/api/students`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        firstName,
        lastName
      })
    })
      .then(res => {
        if (res.status === 200) {
          return Promise.resolve();
        } else {
          return Promise.reject(new Error('Error adding the student'));
        }
      })
      .then(() => this.fetchStudents())
      .then(() => StateService.notify())
      .catch(err => {
        console.error('TODO: Handle this error!!!', err);
      });
  }

  render() {
    return (
      <div className="teacher-container">
        <h3>Students</h3>
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
            {this.state.students.map(person => (
              <tr key={person.id}>
                <th scope="row">{person.id}</th>
                <td>{person.firstName}</td>
                <td>{person.lastName}</td>
                <td>{person.grade} %</td>
                <td>
                  <StudentGradeForm
                    onChangeGrade={(grade) => this.updateStudentGrade(person.id, grade)}
                  />
                </td>
              </tr>
            ))}
          </tbody>
        </table>
        <AddStudentForm
          onAddStudent={this.addStudent}
        />
      </div>
    );
  }
}

class StudentGradeForm extends React.Component {
  constructor(props) {
    super(props);
    this.input = null;
  }

  submit() {
    const newGrade = parseInt(this.input.value, 10);
    this.props.onChangeGrade(newGrade);
    this.input.value = '';
  }

  render() {
    return (
      <div className="form-inline">
        <input
          type="text"
          className="form-control"
          id="formGroupExampleInput2"
          placeholder="New Grade %"
          ref={(elem) => { this.input = elem; }}
        />
        <button
          className="btn btn-default updateBtn"
          onClick={() => this.submit()}
        >
          Update
        </button>
      </div>
    );
  }
}

class AddStudentForm extends React.Component {
  constructor(props) {
    super(props);
    this.firstNameInput = null;
    this.lastNameInput = null;
  }

  submit() {
    const firstName = this.firstNameInput.value;
    const lastName = this.lastNameInput.value;
    this.props.onAddStudent(firstName, lastName);

    this.firstNameInput.value = '';
    this.lastNameInput.value = '';
  }

  render() {
    return (
      <div className="AddStudentForm">
        <h3>Add student</h3>
        <input
          type="text"
          className="form-control"
          placeholder="First Name"
          ref={(elem) => { this.firstNameInput = elem; }}
        />
        <input
          type="text"
          className="form-control"
          placeholder="Last Name"
          ref={(elem) => { this.lastNameInput = elem; }}
        />
        <button
          className="btn btn-default"
          onClick={() => this.submit()}
        >
          Add
        </button>
      </div>
    );
  }
}

export default Teacher;
