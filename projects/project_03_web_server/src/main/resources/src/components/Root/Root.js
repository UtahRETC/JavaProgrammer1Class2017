import React from "react";
import Sidebar from "../Sidebar/Sidebar";

export class Root extends React.Component {
  render() {
    return (
      <div className="container">
        <div className="col">
          <div className="row-xs-10 row-xs-offset-1">
            <Sidebar />
          </div>
        </div>
        <div className="row">
          <div className="col-xs-10 col-xs-offset-1">{this.props.children}</div>
        </div>
      </div>
    );
  }
}

export default Root;
