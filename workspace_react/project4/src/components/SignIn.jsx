import React, { useState } from "react";

const SignIn = () => {
  const [signInfo, setSignInfo] = useState([
    {
      name: "",
      tel: "",
      email: "",
      subject: ""
    },
  ]);

  //모든 input태그의 값이 변경될때 실행할 함수
  //input태그에 입력한 정보를 memberInfo에 저장(변경)하는 기능
  const changeSignInfo =(e)=>{
    setSignInfo({
      ...signInfo,
      [e.target.name]:e.target.value
    })
  }
  
    //setSignInfo()의 [e.target.subject]:e.target.value의 값과 
  // subjectList.name이 같을때 subjectList.text를 출력해보자
  const sameCheck =(e)=>{
    if(setSignInfo.subject.value===subjectList.name){
      signInfo.subject=subjectList.text
    }
  }

  const subjectList = ["국어","영어","수학"]

  return (
    <>
      <div className="inner">
        <div className="tit-area">
          <h3 className="tit">회원가입서</h3>
        </div>
        <div className="cont-area">
          <table className="full">
            <tbody>
              <tr>
                <td>이름</td>
                <td>
                  <input type="text" value={signInfo.name} name="name" onChange={(e)=>{
                    changeSignInfo(e)
                  }}/>
                </td>
              </tr>
              <tr>
                <td>연락처</td>
                <td>
                  <input type="text" value={signInfo.tel} name="tel" onChange={(e)=>{
                    changeSignInfo(e)
                  }} />
                </td>
              </tr>
              <tr>
                <td>이메일</td>
                <td>
                  <input type="email" value={signInfo.email} name="email" onChange={(e)=>{
                    changeSignInfo(e)
                  }}/>
                </td>
              </tr>
              <tr>
                <td>희망과목</td>
                <td>
                  <select name="subject" id=""  onChange={(e)=>{
                    changeSignInfo(e)                  
                  }}>
                    {subjectList.map((subjectList, i) => {
                      return <option key={i} value={subjectList}>{subjectList}</option>;
                    })}
                  </select>
                </td>
              </tr>
            </tbody>
          </table>
          <br />
          <div className="gray">
            <h3 className="sub-tit">작성내용</h3>
            <table className="full">
            <tbody>
              <tr>
                <td>이름</td>
                <td>
                {signInfo.name}
                </td>
              </tr>
              <tr>
                <td>연락처</td>
                <td>
                {signInfo.tel}
                </td>
              </tr>
              <tr>
                <td>이메일</td>
                <td>
                {signInfo.email}
                </td>
              </tr>
              <tr>
                <td>희망과목</td>
                <td>
                  {signInfo.subject}
                </td>
              </tr>
            </tbody>
          </table>
          </div>
        </div>
      </div>
    </>
  );
};

export default SignIn;
