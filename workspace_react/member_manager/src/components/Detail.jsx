import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const Detail = () => {
  const params = useParams();
  const { memId } = params;

  const [member, setMember] = useState({});
  const nav = useNavigate();

  useEffect(() => {
    axios
      .get(`/api/members/${memId}`)
      .then((res) => {
        console.log();
        setMember(res.data);
        console.log(member.memTell);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  const delateMemberInfo = (e) => {
    if (!confirm("ㄹㅇ지울거임?")) {
      alert("잘생각");
      return;
    }
    axios
      .delete(`/api/members/${memId}`)
      .then((res) => {
        console.log();
      })
      .catch((error) => {
        console.log(error);
      });
    alert("삭제완");
  };

  return (
    <>
      <h2>회원정보</h2>
      <table>
        <tbody>
          <tr>
            <th>아이디</th>
            <td>{memId}</td>
          </tr>
          <tr>
            <th>이름</th>
            <td>{member.memName}</td>
          </tr>
          <tr>
            <th>핸폰번호</th>
            <td>{member.memTell}</td>
          </tr>
          <tr>
            <th>비번</th>
            <td>{member.memPw}</td>
          </tr>
          <tr>
            <th>가입일</th>
            <td>{member.joinDate}</td>
          </tr>
          <tr>
            <th>소개</th>
            <td>{member.memIntro}</td>
          </tr>
        </tbody>
      </table>
      <button
        type="button"
        onClick={(e) => {
          nav(`/`);
        }}
      >
        목록으로 가기
      </button>
      <button
        type="button"
        onClick={(e) => {
          nav(`/update/${member.memId}`);
        }}
      >
        회원수정
      </button>
      <button
        type="button"
        onClick={(e) => {
          delateMemberInfo(`/delete/${member.memId}`);
          nav("/");
        }}
      >
        삭제
      </button>
    </>
  );
};

export default Detail;
