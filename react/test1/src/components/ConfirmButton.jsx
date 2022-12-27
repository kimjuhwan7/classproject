import React from "react";
import { useState } from "react";

function ConfirmButton(props) {
  const [isConfirmed, setisConfirmed] = useState(false);

  const handleConfirm = () => {
    setisConfirmed((prevIsConfirmed) => !prevIsConfirmed);
  };

  return (
    <button onClick={handleConfirm} disabled={isConfirmed}>
      {isConfirmed ? '확인 완료' : '확인 하기'}
    </button>
  );
}
export default ConfirmButton;