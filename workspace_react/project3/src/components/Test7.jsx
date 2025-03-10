
import { useState } from 'react';
import '../style/Test7.css';

const Test7 = (e) => {
  const [show,setShow] = useState(false);
  
  return (
    <>
      <h3>실습7_마우스를 올리면 파란네모가 보이고, 마우스를 내리면 파란네모가 사라지게 해보세요.</h3>
      <div className="redbox"
      onMouseEnter={()=>{setShow(true)}}
      onMouseLeave={()=>{setShow(false)}}>
        마우스를 올리면 숨겨진 글자가 보여요
      </div>
      {show?<div className="bluebox">Hello React!</div>:null}
    </>
  )
}

export default Test7