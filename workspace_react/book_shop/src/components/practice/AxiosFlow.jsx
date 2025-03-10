import axios from 'axios';
import React, { useEffect, useState } from 'react'

const AxiosFlow = () => {
  
  const [num, setNum] = useState(0);

  useEffect(()=>{
    if(num != 0){
      //받은 게시글 번호에 달린 댓글 목록 조회
      axios.get(`/api/replies/${num}`)
      .then()
      .catch();
    }
  },[num]);

  useEffect(()=>{
    console.log('통신전');

    axios.get('api/test/1')
    .then((res)=>{console.log('통신성공이다');
      //서버에서 받은 게시글 번호를 num에 저장
      setNum(res.data)
      console.log('통신후'+{num});
    })
    .catch();
    
    console.log('가짜통신후'+{num});

  },[]);
  
  return (
    <div>AxiosFlow</div>
  )
}

export default AxiosFlow