import React from "react";

function FancyBoder(props) {
  return <div className={"border-" + props.color}>{props.children}</div>;
}
export default FancyBoder;
