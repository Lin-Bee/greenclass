import axios from "axios";

const LottoNum = (props) => {
  const getLotto = (index) => {
    axios
      .get("/api/getLotto")
      .then((res) => {
        console.log(res.data);
        const copyLotto = [...props.lotto];
        copyLotto[index] = res.data;
        props.setLotto(copyLotto);
      })
      .catch((error) => {
        console.log("오류임 ㅡㅡ");
        console.log(error);
      });
  };

  return (
    <>
      <li>
        <p>{props.lottoCont}</p>
        <p>
          <button
            type="button"
            onClick={(e) => {
              getLotto(props.i);
            }}
          >
            생성
          </button>
        </p>
      </li>
    </>
  );
};

export default LottoNum;
