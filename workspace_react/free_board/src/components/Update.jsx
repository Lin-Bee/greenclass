import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const Update = () => {
  const prams = useParams();
  const { boardNum } = prams;
  const nav = useNavigate();

  const [boardCont, setBoardCont] = useState({}); //기본get으로 받아오는거


  // 1. 불러온 값을 바탕으로 내용을 수정한걸 등록한다
  // 근데 아직 3번에서 axios하지않아서 boardCont가 빈값임
  const setChangeBoardCont = (e) => {
    setBoardCont({
      ...boardCont,
      [e.target.name]: e.target.value,
    });
  };

  //3. 변경할 정보확인을 위해 불러오기
  useEffect(() => {
    axios
      .get(`/api/boards/${boardNum}`)
      .then((res) => setBoardCont(res.data))
      .catch((error) => {
        console.log(error);
        console.log("왜 안되는데");
      });
  }, [boardNum]);

  //send시. put을통해 전송한다.
  const sendData = (e) => {
    axios
      .put(`/api/boards/${boardNum}`, boardCont) //(링크 , 수정해서 보낼정보
      .then(() => {
        console.log("수정완");
        nav(`/detail/${boardNum}`);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  return (
    <>
      <div className="tit-box">
        <h3>게시판 수정페이지</h3>
      </div>
      <div className="cont-area">
        <table>
          <tbody>
            <tr>
              <th>작성일</th>
              <td>{boardCont.regDate}</td>
              <th>작성자</th>
              <td>{boardCont.writer}</td>
            </tr>
            <tr>
              <th>제목</th>
              <td colSpan={3}>
                <input
                  type="text"
                  name="title"
                  value={boardCont.title}
                  onChange={(e) => {
                    setChangeBoardCont(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <th>내용</th>
              <td colSpan={3}>
                <textarea
                  name="content"
                  id="board-content"
                  value={boardCont.content}
                  onChange={(e) => {
                    setChangeBoardCont(e);
                  }}
                ></textarea>
              </td>
            </tr>
          </tbody>
        </table>
        <div className="btn-area">
          <button
            type="button"
            onClick={(e) => {
              nav(`/`);
            }}
          >
            수정안해돌아가
          </button>

          <button
            className="{style.btn}"
            type="button"
            onClick={(e) => {
              sendData();
            }}
          >
            수정완
          </button>
        </div>
      </div>
    </>
  );
};

export default Update;
