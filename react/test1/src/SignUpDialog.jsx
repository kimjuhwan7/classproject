import React from "react";
import { useState } from "react";
import Dialog from "./Dialog";

let room = [];

function SignUpDaialog(props) {
  const [nickName, setnickName] = useState("손흥민");

  const handleClick = (event) => {
    alert(`어서오세요~~~!! ${nickName}님`);
    room.push(nickName);
    setnickName("");
  };

  return (
    <Dialog title="프로젝트 팀 참여" message="닉네임을 입력해주세요.">
      <input
        type="text"
        value={nickName}
        onChange={(event) => {
          setnickName(event.target.value);
        }}
      />
      <button onClick={handleClick}>참여하기</button>
 
      <div>{room.map((name,index)=>{
        return <p key={index}>{name}</p>
      })}</div>
    </Dialog>
  );
}

export default SignUpDaialog;
