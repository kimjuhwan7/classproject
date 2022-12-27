import React from "react";
import { useRef } from "react";

function TextInputButton(props) {
  const inputElem = useRef(null);

  const onButtonClick = () => {
    //current 는 연결되어 있는 객체 input을 가르킨다
    inputElem.current.focus();
    inputElem.current.value = "new Message";
  };

  return (
    <div>
      <input ref={inputElem} type="text"></input>
      <button onClick={onButtonClick}>Focus the input</button>
    </div>
  );
}
export default TextInputButton;
