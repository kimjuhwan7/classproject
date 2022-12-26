import React from "react";

function UserInfo(props) {
  return (
    <div className="userInfo">
      <UserInfo user={props.user} />
      <div className="userInfoName">{props.user.userName}</div>
    </div>
  );
}
export default UserInfo;
