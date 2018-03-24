import React from "react";
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
    return fetch(`/api/people`)
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

  render() {
    return (
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

export default Teacher;
