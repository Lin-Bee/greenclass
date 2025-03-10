import React, { useState } from "react";
import LottoNum from "./LottoNum";

const Lotto = () => {
  const [lotto, setLotto] = useState([0, 0, 0, 0, 0, 0]);

  return (
    <>
      <h2>로또 자동 번호 생성기</h2>
      <div className="gray-box">
        <ul className="flex">
          {lotto.map((lottoCont, i) => {
            return (
              <LottoNum
                key={i}
                i={i}
                lottoCont={lottoCont}
                lotto={lotto}
                setLotto={setLotto}
              />
            );
          })}
        </ul>
      </div>
    </>
  );
};

export default Lotto;
