import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const ReplyList = (props) => {
  const [replyList, setReplyList] = useState([]);
  const nav = useNavigate();
  const { boardNum } = props;
  const [num, setNum] = useState(0);

  useEffect(() => {
    axios
      .get(`/api/replys/${boardNum}`)
      .then((res) => {
        setReplyList(res.data);
        console.log(res.data);
        console.log(res.data.replyNum);
      })
      .catch((error) => console.log(error));
  }, [num]);

  const deleteReply = (replyNum) => {
    const result = confirm('지우실?');
    if(!result){return;}

    axios
      .delete(`/api/replys/${replyNum}`)
      .then((res) => {
        alert("지워짐");
        setNum(num+1);
      })
      .catch((error) => console.log(error));
  };

  return (
    <>
      <div className="reply-area">
        <div className="list-area">
          {replyList.map((replyCont, i) => {
            return (
              <div key={i}>
                <dl>
                  <dt className="flex ju-between">
                    <span className="name">{replyCont.writer}</span>
                    <span className="date">{replyCont.regDate}</span>
                  </dt>
                  <dd>
                    <div className="flex">
                      <div className="cont">{replyCont.content}</div>
                      <div className="btn">
                        <button
                          type="button"
                          onClick={() => {
                            deleteReply(replyCont.replyNum);
                          }}
                        >
                          삭제
                        </button>
                      </div>
                    </div>
                  </dd>
                </dl>
              </div>
            );
          })}
        </div>
      </div>
    </>
  );
};

export default ReplyList;
