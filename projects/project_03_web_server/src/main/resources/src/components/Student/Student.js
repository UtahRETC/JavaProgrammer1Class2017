import React from "react";
import "./Student.css";

export class Student extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      loading: true,
      student: null
    };
  }

  componentDidMount() {
    const studentId = this.props.params.id;
    this.fetchStudent(studentId);
  }

  componentWillReceiveProps(newProps) {
    if (newProps.params) {
      const studentId = newProps.params.id;
      this.fetchStudent(studentId);
    }
  }

  fetchStudent = (studentId) => {
    return fetch(`/api/students/${studentId}`)
      .then(res => res.json())
      .then(body => {
        if (body) {
          return Promise.resolve(body);
        } else {
          return Promise.reject(new Error('No student found!'));
        }
      })
      .then(student => {
        this.setState({
          loading: false,
          student: student
        });
      })
      .catch(err => {
        console.error('Error:', err);
      });
  }

  render() {
    const { loading, student } = this.state;
    if (loading) {
      return this.renderLoadingState();
    }

    return (
      <div className="student-container">
        <div>
          <img className="student-pic" alt="Avatar" src="/avatar.jpg" />
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
              <th scope="row">{student.id}</th>
              <td>{student.firstName}</td>
              <td>{student.lastName}</td>
              <td>{student.grade} %</td>
            </tr>
          </tbody>
        </table>
      </div>
    );
  }

  renderLoadingState() {
    return (
      <div>Loading...</div>
    );
  }
}

export default Student;
