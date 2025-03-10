import React, { useState } from 'react'

const RadioInput = () => {
  //선택한 라디오의 값을 저장할 state 변수
  const [feel,setFeel]=useState('normal');
  const feelList=[
    {value:"good", text:'조아'},
    {value:"normal", text:'보통'},
    {value:"bad", text:'나쁨'},
  ]

  return (
    <>
      <br/>
      <div className="inner">
        <div className="tit">Radio Input</div>
        <div>
          <input type="radio" name="emotion" id="" value='good'
          checked={feel==='good'}
          onChange={(e)=>{
            setFeel(e.target.value);
          }}
          />좋음
          <input type="radio" name="emotion" id="" value='normal'
          checked={feel==='normal'}
          onChange={(e)=>{
            setFeel(e.target.value);
          }}
          />보통
          <input type="radio" name="emotion" id="" value='bad'
          checked={feel === 'bad'}
          onChange={(e)=>{
            setFeel(e.target.value);
          }}
          />나쁨
          <br/>
          <p>선택한 값:</p>
          {feel}
        </div>
        <br/>
        <br/>
        <div className="tit">Radio Input</div>
        <div>
          {/* {feelList.map((feelList,e)=>{
           return (
            <input type="radio" name="emotion" id="" value={feelList.value}
            checked={feel === feelList.value}
            onChange={(e)=>{
              setFeel(e.target.value);
            }}
            />{feelList.text};
          ) 
          })} */}
        </div>
      </div>
    </>
  )
}

export default RadioInput