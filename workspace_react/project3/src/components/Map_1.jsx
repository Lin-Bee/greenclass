import React from 'react'

const Map_1 = () => {

  const arr1 = [1,2,3,4,5];

  return (
    <>
    {arr1.map((num,i)=>{
      return (
        <div key={i}>list[{i}]({num})가 출력되는 영역입니다.</div>
        //shuld have a unique "key" prop.
      );
    })}
    </>
  )
}

export default Map_1