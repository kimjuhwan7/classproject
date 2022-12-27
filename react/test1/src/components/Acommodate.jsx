import React from "react";
import { useEffect } from "react";
import { useState } from "react";
import useCounter from "./useCounter";

const MAX_CAPACITY = 10;

function Acommodate(props) {
  const [isFull, setIsFull] = useState(false);
  const [count, incrementCount, decrementCount] = useCounter(0);

 /*  useEffect(() => {
    console.log("useEffect() is called.", `isFull : ${isFull}`);
  }); */
  useEffect(() => {
    setIsFull(count >= MAX_CAPACITY);
    console.log(`접속 인원: ${count}`);
  });

  return (
    <div style={{ padding: 16, margin: 5 }}>
      <p>{`총 ${count}명 입장했습니다.`}</p>
      <button onClick={incrementCount} disabled={isFull}>입장</button>
      <button onClick={decrementCount}>퇴장</button>
      {isFull && <p style={{color:'red'}}>정원이 가득 찼습니다.</p>}
    </div>
  );
}
export default Acommodate;
