import React from "react";

function WarnningBanner(props) {
  // true => 위험!! , false => 화면 출력 하지 않는 처리

  if (!props.warning) {
    return null;
  }

  return <div>경고!</div>;
}
export default WarnningBanner;
