import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const Join = () => {
  const nav = useNavigate();
  //멤버는 이러하다 라고 기본셋팅
  const [member, insertMember] = useState({
    memId: "",
    memName: "",
    memPw: "",
    memTell: "",
    memIntro: "",
    pwConfirm: "",
  });

  //멤버의 값은 아래에서 입력한 값을 넣을것이다
  const addMember = (e) => {
    console.log(e.target.name);
    insertMember({ ...member, [e.target.name]: e.target.value });
  };

  //보낼것이다 언제? post로 했을때
  const validateRegData = () => {
    let isValid = true;

    if (member.memId === "") {
      alert("아디는 필수입력이다짜샤");
      isValid = false;
    }
    if (member.memName === "") {
      alert("이름은 필수입력이다짜샤");
      isValid = false;
    }
    if (member.memPw === "") {
      alert("비번은 필수입력이다짜샤");
      isValid = false;
    }
    if (member.memPw !== member.pwConfirm) {
      alert("비번이 다르다구");
      isValid = false;
    }

    return isValid;
  };
  //최종적으로는 saveMember가 왕이고
  const sendData = () => {
    if (!validateRegData()) {
      return;
    }
    axios
      .post("/api/members", member) // memberdml 값을 보낼것이다
      .then((res) => {
        if (res.data !== 1) {
          alert("알 수 없는 이유로 오류발생");
          return;
        }
        alert(`${member.memId}가입ㅊㅊ`);
        nav("/");
      })
      .catch((error) => {
        console.log("안되고");
        console.log(error);
      });
  };

  return (
    <>
      <h3>회원가입</h3>
      <form action="">
        <table>
          <tbody>
            <tr>
              <th>아이디</th>
              <td>
                <input
                  type="text"
                  id="memId"
                  value={member.memId}
                  name="memId"
                  onChange={(e) => {
                    addMember(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <th>비밀번호</th>
              <td>
                <input
                  type="password"
                  id="memPw"
                  value={member.memPw}
                  name="memPw"
                  onChange={(e) => {
                    addMember(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <th>비밀번호 확인</th>
              <td>
                <input
                  type="password"
                  id="pwConfirm"
                  value={member.pwConfirm}
                  name="pwConfirm"
                  onChange={(e) => {
                    addMember(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <th>이름</th>
              <td>
                <input
                  type="text"
                  id="memName"
                  value={member.memName}
                  name="memName"
                  onChange={(e) => {
                    addMember(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <th>회원소개</th>
              <td>
                <input
                  type="text"
                  id="memIntro"
                  value={member.memIntro}
                  name="memIntro"
                  onChange={(e) => {
                    addMember(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <th>전화번호</th>
              <td>
                <input
                  type="text"
                  id="memTell"
                  value={member.memTell}
                  name="memTell"
                  onChange={(e) => {
                    addMember(e);
                  }}
                />
              </td>
            </tr>
          </tbody>
        </table>
        <button
          type="button"
          onClick={(e) => {
            sendData(); //전송용 axios
          }}
        >
          등록
        </button>
      </form>
    </>
  );
};

export default Join;
