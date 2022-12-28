import React, { useState } from "react";

function RequestForm(props) {
  const [value, setVelue] = useState("요청사항을 입력하세요!");

  const handleChange = (event) => {
    setVelue(event.target.value);
  };

  const handleSubmit = (event) => {
    alert("입력한 요청사항 :" + value);
    event.preventDefault();
  };
  return (
    <form onSubmit={handleSubmit}>
      <label>
        요청사항 :<textarea value={value} onChange={handleChange}></textarea>
      </label>
      <br />
      <button type="submit">제출</button>
    </form>
  );
}
export default RequestForm;
