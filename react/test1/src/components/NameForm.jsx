import React from "react";
import { useState } from "react";

function NameForm(props) {
  const [value, setVelue] = useState("");

  const handleChange = (event) => {
    setVelue(event.target.value);
  };
  const handleSubmit = (event) => {
    alert("입력한 이름: " + value);
    event.preventDefault();
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        이름:
        <input type="text" value={value} onChange={handleChange}></input>
      </label>
      <button type="submit">제출</button>
    </form>
  );
}

export default NameForm;
