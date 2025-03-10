import axios from "axios";
import dayjs from "dayjs";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import ReplyList from "./ReplyList";
import styles from "./Detail.module.css";
import ReplyWrite from "./ReplyWrite";

const Detial = () => {
  const nav = useNavigate();
  const params = useParams();
  const { boardNum } = params;
  const [boardCont, setBoardCont] = useState({});

  useEffect(() => {
    axios
      .get(`/api/boards/${boardNum}`)
      .then((res) => {
        console.log("불러와가 왜111 ");
        console.log(res.data);
        setBoardCont(res.data);
      })
      .catch((error) => {
        console.log(error);
        console.log("실패다");
      });
  }, [boardNum]);

  //한곳에서 여러가지것을 불러올때 all으로 여러개 불러오기 가능
  //지금은 터지니깐 기본형식만
  // useEffect(() => {
  //   axios
  //     .all([
  //       axios.get(`/api/boards/${boardNum}`),
  //       axios.get(`/api/replys/${boardNum}`),
  //     ])
  //     .then(
  //       axios.spread((board,reply) => {
  //         console.log(board.data);
  //         console.log(reply.data);
  //         setBoardCont(board.data);
  //         setReplyList(reply.data);
  //       })
  //     )
  //     .catch((error) => console.log(error));
  // }, [boardNum]);

  const deleteCont = () => {
    const result = confirm("삭제하게?");
    if (!result) {
      return;
    }
    axios
      .delete(`/api/boards/${boardNum}`)
      .then((res) => {})
      .catch((error) => {});
    alert("손가락을 잘못놀린죄");
    nav("/");
  };

  const day = dayjs(boardCont.regDate).format("YYYY.MM.DD HH:mm:ss");

  return (
    <>
      <div className={styles.detail_container}>
        <div className="tit-box">
          <h3>게시판 상세페이지</h3>
        </div>
        <div className="cont-area">
          <div className={styles.detail_btn}>
            <button
              type="button"
              onClick={(e) => {
                nav("/");
              }}
            >
              목록으로
            </button>
            <button
              type="button"
              onClick={(e) => {
                nav(`/update/${boardNum}`);
              }}
            >
              수정
            </button>
            <button
              type="button"
              onClick={(e) => {
                deleteCont(e);
              }}
            >
              삭제
            </button>
          </div>
          <table>
            <colgroup>
              <col width="17%" />
              <col width="16.3%" />
              <col width="17%" />
              <col width="16.3%" />
              <col width="17%" />
              <col width="16.3%" />
            </colgroup>
            <tbody>
              <tr>
                <th>작성일</th>
                <td>{day}</td>
                <th>작성자</th>
                <td>{boardCont.writer}</td>
                <th>조회수</th>
                <td>{boardCont.readCnt}</td>
              </tr>
              <tr>
                <th>제목</th>
                <td colSpan={5}>{boardCont.title}</td>
              </tr>
              <tr>
                <th>내용</th>
                <td colSpan={5}>
                  <div>
                    <pre>{boardCont.content}</pre>
                  </div>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
      <ReplyWrite boardNum={boardNum} />
      <ReplyList boardNum={boardNum} />
    </>
  );
};

export default Detial;
