import React, { Component } from "react";
import { Router, Route, browserHistory, IndexRoute } from "react-router";
import {} from "react-bootstrap";

import { Home } from "./components/Home/Home";
import { Student } from "./components/Student/Student";
import { Teacher } from "./components/Teacher/Teacher";
import { Root } from "./components/Root/Root";

import "./App.css";

class App extends Component {
  render() {
    return (
      <Router history={browserHistory}>
        <Route path={"/"} component={Root}>
          <IndexRoute component={Home} />
          <Route
            path={"teacher"}
            component={Teacher}
          />
          <Route
            path={"student/:id"}
            component={Student}
          />
        </Route>
      </Router>
    );
  }
}

export default App;
