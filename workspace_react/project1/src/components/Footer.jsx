import React from "react";

function Footer() {
  return (
    <>
      <footer>푸터입니다</footer>
      <button type="button" onClick={()=>{
        console.log('고기');
      }}>버튼1입니다</button>
      <br />
      <br />
      <br />
      <button type="button" onMouseEnter={()=>{
        console.log('소식');
      }}>버튼2입니다</button>
      <br />
      <br />
      <br />
      <input type="text" onChange={()=>{
        alert('값이바뀌어써용');
      }}/>
    </>
  );
}

export default Footer;
