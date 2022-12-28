import React from "react";
import AContainer from "./aContainer";
import ADetails from "./ADetails";
//• Display컴포넌트는 상품 목록을 전달받아서 이를 화면에 반복문을 통해서 출력.

function ADisplay(props) {
  //양쪽에서 가져와서 출력

  const ThemeContext = React.createContext("");

  return (
    <div>
      <AContainer title={title} content={content}/>
      <ADetails title={title} content={content} />
    </div>
  );
}
export default ADisplay;
