import axios from "axios";
import { useEffect, useState } from "react";

const List = ({ setBoard, setIsShow }) => {
  const [boardList, setBoardList] = useState([]);

  useEffect(() => {
    axios
      .get("/api/boardInfo")
      .then((res) => {
        console.log("데이터 잘 가져옴");
        setBoardList(res.data);
      })
      .catch((error) => {
        console.log("에러");
      });
  }, []);

  return (
    <>
      <div>
        <table className="t1">
          <colgroup>
            <col width={"10%"} />
            <col width={"50%"} />
            <col width={"30%"} />
            <col width={"10%"} />
          </colgroup>
          <thead>
            <tr>
              <th>NO</th>
              <th>제목</th>
              <th>작성자</th>
              <th>조회수</th>
            </tr>
          </thead>
          <tbody>
            {boardList.length == 0 ? (
              <tr>
                <td colSpan={4}>노데이터</td>
              </tr>
            ) : (
              boardList.map((board, i) => {
                return (
                  <tr key={i}>
                    <td>{boardList.length - i}</td>
                    <td>
                      <span
                        onClick={(e) => {
                          // 클릭한 제목의 게시글의 글번호찾기
                          board.no;
                          console.log(board.no);
                          for (let i = 0; i < boardList.length; i++) {
                            if (boardList[i].no == board.no) {
                              setBoard(boardList[i]);
                              setIsShow(true);
                            }
                          }
                        }}
                      >
                        {board.subject}
                      </span>
                    </td>
                    <td>{board.writer}</td>
                    <td>{board.cnt}</td>
                  </tr>
                );
              })
            )}
          </tbody>
        </table>
      </div>
    </>
  );
};

export default List;
