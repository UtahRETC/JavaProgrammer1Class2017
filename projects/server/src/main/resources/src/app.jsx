import React, { Component } from "react";
import ReactDOM from "react-dom";
import axios from "axios";

const API_GET_STUDENTS = "/api/students";

class StudentList extends Component {
  componentWillMount() {
    axios.get(API_GET_STUDENTS)
      .then(x => console.log(x))
  }

  render() {
    return <div>hi</div>;
  }
}

class App extends Component {
  render() {
    return <StudentList />;
  }
}

ReactDOM.render(<App />, document.getElementById("app"));
