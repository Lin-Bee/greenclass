import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const Write = () => {
  const nav = useNavigate();
  const [insertCont, setinsertCont] = useState({
    title: "",
    writer: "",
    content: "",
  });
  const setWriteCont = (e) => {
    setinsertCont({
      ...insertCont,
      [e.target.name]: e.target.value,
    });
  };

  const sendData = () => {
    axios
      .post("/api/boards", insertCont)
      .then((res) => {
        console.log(res.data);
      })
      .catch((error) => {
        console.log(error);
      });
    alert("작성완료다 이거사ㅠㅠㅠ");
    nav(`/`);
  };

  return (
    <>
      <div className="tit-box">
        <h3>게시글작성페이지</h3>
      </div>
      <div className="cont-area">
        <table>
          <tbody>
            <tr>
              <th>제목</th>
              <td>
                <input
                  type="text"
                  name="title"
                  className="full"
                  id="board-title"
                  onChange={(e) => {
                    setWriteCont(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <th>작성자</th>
              <td>
                <input
                  type="text"
                  name="writer"
                  className="full"
                  id="board-writer"
                  onChange={(e) => {
                    setWriteCont(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <th>내용</th>
              <td>
                <textarea
                  name="content"
                  id="board-content"
                  onChange={(e) => {
                    setWriteCont(e);
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
              sendData(e);
            }}
          >
            작성완
          </button>
        </div>
      </div>
    </>
  );
};

export default Write;
