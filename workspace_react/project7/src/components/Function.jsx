import React from "react";

const Function = () => {
  return (
    <>
      <div className="inner Function">
        <h2>Props</h2>
        <br />
        <p>컴포넌트의 시작은 대문자로 할 것 &gt; 데이터전달이 가능한가</p>
        <p>props는 컴포넌트 사이의 데이터를 전달하는 아이</p>
        <p>단방향만 가능함</p>
        <br />
        <div>
          <p>현재 헤드의 이름에 react를 달아주었음</p>
          <p>&lt;Header name=&#123; &quot; react &quot; &#125;/&gt;</p>
          <p>부모 컴포넌트인 Header가 자식 컴포넌트인 name,hobby한테 적용가능</p>
          {/* <p>&quot; &apos;</p> */}
          <p>태그명 뿐만 아니라 속성에도 변수를 줄수 있음</p>
        </div>
      </div>
    </>
  );
};

export default Function;
