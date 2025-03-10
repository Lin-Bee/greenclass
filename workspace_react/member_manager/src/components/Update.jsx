import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const Update = () => {
  const params = useParams(); //라우트에 설정된 URL에 데이터 파라미터가져오는거
  const { memId } = params;
  const nav = useNavigate();

  const [basicMember, setBasicMember] = useState({}); //미리 받아온

  const [updateMember, setUpdateMember] = useState({
    //update하려는 memeber
    memName: '',
    memIntro: '',
    memTell: '',
  });

  //미리받아온거 셋팅
  useEffect(() => {
    axios
      .get(`/api/members/${memId}`)
      .then((res) => {
        console.log();
        setBasicMember(res.data);
        setUpdateMember({
          memName: basicMember.memName,
          memIntro: basicMember.memIntro,
          memTell: basicMember.memTell,
        });
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  // 재조정해줌
  //${memId}
  const updateMemberInfo = (e) => {
    axios
      .put(`/api/members/${memId}`, updateMember)
      .then((res) => {
        console.log("ㅇㅇ");
        nav(`/detail/${memId}`);
      })
      .catch((error) => {
        console.log(error);
        console.log("ㄴㄴ");
      });
  };

  const updateMemberCont = (e) => {
    e.preventDefault();
    //change라인들
    setUpdateMember({
      ...basicMember,
      [e.target.name]: e.target.value,
    });
  };

  return (
    <>
      <h3>회원정보수정</h3>
      <table>
        <tbody>
          <tr>
            <th>아이디</th>
            <td>{basicMember.memId}</td>
          </tr>
          <tr>
            <th>이름</th>
            <td>
              <input
                type="text"
                id="memName"
                defaultValue={basicMember.memName}
                name="memName"
                onChange={(e) => {
                  updateMemberCont(e);
                }}
                required
              />
            </td>
          </tr>
          <tr>
            <th>회원소개</th>
            <td>
              <input
                type="text"
                id="memIntro"
                defaultValue={basicMember.memIntro}
                name="memIntro"
                onChange={(e) => {
                  updateMemberCont(e);
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
                defaultValue={basicMember.memTell}
                name="memTell"
                onChange={(e) => {
                  updateMemberCont(e);
                }}
                required
              />
            </td>
          </tr>
          <tr>
            <th>가입일</th>
            <td>{basicMember.joinDate}</td>
          </tr>
        </tbody>
      </table>
      <button
        type="button"
        onClick={(e) => {
          updateMemberInfo();
        }}
      >
        업데이트
      </button>
    </>
  );
};

export default Update;
