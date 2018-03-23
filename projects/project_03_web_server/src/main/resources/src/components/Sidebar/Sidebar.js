import React from "react";
import { Link } from 'react-router';
import "./Sidebar.css";

import jsonData from "../../data.json";

export class Sidebar extends React.Component{

  constructor(){
    super();
    this.state = {students: []};
  }
  componentWillMount(){
    var studentsToAdd = [];
    jsonData.people.forEach(function(person) {
      if (person.type === "STUDENT"){
        studentsToAdd.push(person);
      }
    });
    this.setState({students: studentsToAdd});
  }


  render() {
    let studentsToRender = this.state.students;

    return(
      <nav className="sidenav">
        <Link to={"/"}>Home</Link>
        <div className="group-header">
          Students
        </div>
        {studentsToRender.map(student => <Link key={student.id} className="student-link" to={"/student/"+student.id} activeStyle={{color:"#BBB"}}>{student.firstName}</Link>)}
        <div className="group-header">
          Teachers
        </div>
        <Link to={"/teacher/"} className="student-link" activeStyle={{color:"#BBB"}}>Teacher</Link>
      </nav>
    );
  }
}

export default Sidebar;
