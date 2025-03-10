import React, { useState } from "react";

const Input_2 = () => {
  // 각각으로 구분하는것 {}
  // const [name,setName] = useState('');
  // const [age,setAge] = useState('');
  // const [addr,setAddr] = useState('');
  //사람의 이름과 나이 주소를 입력해서 뿌려주는 스태이트변수
  const [human, setHuman] = useState([{ name: "", age: "", addr: "" }]);
  //input태그의 값이 변경되면 실행시킬 함수
  function changeDate(e) {
    setHuman({
      ...human,
      [e.target.name]: e.target.value,
    });
  }

  // const aaa='';
  // console.log(human.aaa);
  // console.log(human[aaa]); //key값이 변수일때 사용

  return (
    <>
      <div className="inner">
        <div className="tit-area">
          <h3 className="tit">인간</h3>
        </div>

        <div>
          <p>
            이름 :{' '}
            <input
              name="name"
              type="text"
              value={human.name}
              onChange={(e) => {
                changeDate(e);
              }}
            />
          </p>
          <p>
            나이 :{' '}
            <input
              name="age"
              type="text"
              value={human.age}
              onChange={(e) => {
                changeDate(e);
              }}
            />
          </p>
          <p>
            주소 :{' '}
            <input
              name="addr"
              type="text"
              value={human.addr}
              onChange={(e) => {
                changeDate(e);
              }}
            />
          </p>
        </div>

        <div>
          <p>입력받은 이름 : {human.name}</p>
          <p>입력받은 나이 : {human.age}</p>
          <p>입력받은 주소 : {human.addr}</p>
        </div>
      </div>
    </>
  );
};

export default Input_2;
