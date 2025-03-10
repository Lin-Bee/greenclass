import axios from "axios";
import React, { useEffect, useState } from "react";

const Write = (e) => {
  const [insertCont, setinsertCont] = useState({});
  setinsertCont({
    ...insertCont,
    [e.target.name]: e.target.value,
  });
  useEffect((e) => {
    axios
      .post("/api/boards/write")
      .then((res) => {
        console.log(res.data);

      })
      .catch((error) => {
        console.log(error);
      });
  });

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
                  value=""
                  className="full"
                  id="board.title"
                />
              </td>
            </tr>
            <tr>
              <th>작성자</th>
              <td>
                <input
                  type="text"
                  name="writer"
                  value=""
                  className="full"
                  id="board.writer"
                />
              </td>
            </tr>
            <tr>
              <th>내용</th>
              <td>
                <textarea name="content" id="board.content"></textarea>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </>
  );
};

export default Write;
