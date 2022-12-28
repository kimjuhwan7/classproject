import React from "react";
import FancyBoder from "./components/FancyBorder";

function Dialog(props) {
  return (
    <FancyBoder color="blue">
      <h1>{props.title}</h1>
      <p>{props.message}</p>
      {props.children}
    </FancyBoder>
  );
}
export default Dialog;
