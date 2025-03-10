import React from 'react'

const Map_forEach = () => {
  function aaa(){
    console.log(3);
  }
  //반복문 for, for of, forEach(), map()
  
  const arr = [1,2,5,9];
  //forEach() : ()안의 내용을 반복 실행!
  //배열(배열의 요소,배열의[넘버링] )=>{}
  arr.forEach((item,i)=>{ //<매개변수의값으로 함수가 들어올수있는 js -  aaa넣을수있음
    console.log(`a= ${item}, b= ${i}`); //
    //for문+for of 문
  });
  console.log(""); //
  //()안의 내용을 반복실행!!!!
  //arr.map(aaa);
  const result = arr.map((item,i)=>{
    console.log(`a= ${item}, b= ${i}`); //
    return item*2;
  }); //map()은 return으로 받아올수있음
  console.log(result);

  return (
    <>
      <div>Map_forEach</div>
      
    </>
  )
}

export default Map_forEach