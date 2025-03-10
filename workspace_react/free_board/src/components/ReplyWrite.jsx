import axios, { Axios } from "axios";
import React, { useState } from "react";
import { useParams } from "react-router-dom";

const ReplyWrite = (props) => {
  //useState 입력한 데이터 저장변수
  //  => ({화면이뜰때 보여주고싶은데이터 or "" 등 원하는거})
  const { boardNum } = props;
  const [reply, setReply] = useState({
    writer: "",
    content: "",
    name: "",
    // 인풋데이터 만들때 키값 만듬 : 그외에는??
  });

  const changeReply = (e) => {
    setReply({
      ...reply,
      [e.target.name]: e.target.value,
    });
  };

  const sendData = (e) => {
    axios
      .post(`/api/replys/${boardNum}`, reply)
      .then((e) => {
        alert("댓글이 달렸다 그만 누르거라");
        window.location.reload();
      })
      .catch();
  };

  return (
    <>
      <div className="tit-sub-box">
        <h4>댓글작성</h4>
      </div>
      <div className="write-area">
        <input
          type="text"
          className="full"
          placeholder="작성자"
          value={reply.writer}
          name="writer"
          onChange={(e) => {
            changeReply(e);
          }}
        />
        <div>
          <textarea
            id=""
            placeholder="댓글내용입력"
            value={reply.content}
            name="content"
            onChange={(e) => {
              changeReply(e);
            }}
          ></textarea>
        </div>
      </div>
      <div className="btn-area">
        <button
          type="button"
          onClick={(e) => {
            sendData(e);
          }}
        >
          작성
        </button>
      </div>
    </>
  );
};

export default ReplyWrite;
