import React from "react";
//• Details컴포넌트는 선택한 상품의 상세 정보를 Container에게 전달받아서 출력.
function ADetails(props) {
  //컨테이너에서 출력한 목록을 클릭하면 나오는 상세 페이지
  return (
    <div>
      {title && <h1>{title}</h1>}
      {props.children}
    </div>
  );
}
export default ADetails;
