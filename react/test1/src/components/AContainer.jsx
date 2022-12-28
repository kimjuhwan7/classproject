import React from "react";
import { useContext } from "react";
//• Container컴포넌트는 상품 목록을 가지고 있고 현재 어떤 상품이 클릭되었는지를 상태로 유지.

function zContainer(props) {
  //상품1 상품2 등 목록출력

  const { aDetails, toggleADetails } = useContext(ADetails);

  return (
    <div className={"상품" + props.color}>
      {props.children}
    </div>
  );
}

export default AContainer;
