import React from "react";

// 상위 컴포넌트에서 선택된 데이터를 전달 받아서 출력 컴포넌트
function Details({ menu }) {
  if (!menu) {
    return <div>선택된 메뉴가 없습니다.</div>;
  }
  return(
    <div>
        <h3>상품 번호 : {menu.mno}</h3>
        <h3>상품 이름 : {menu.name}</h3>
        <h3>상품 가격 : {menu.price}</h3>
    </div>
  )
}
export default Details;
