import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { decrese, handleCounter, increse } from '../redux/counterSlice';

const Test1 = () => {
  //공용창고 store의 name을 데려오기 위해서
  const counter = useSelector(STATE=>STATE.counter);
  //스토어 내부의 reducers(함수)을 가져올때는 
  const dispatch = useDispatch();

  // const [num,setNum] = useState(5);
  // const abc  = 10;
  // setNum(num+abc);

  return (
    <>
      <div>{counter}</div>
      <button type='button' onClick={()=>{
        dispatch(handleCounter(9));
      }}>handleCounter</button>

      <button type='button' onClick={()=>{
        dispatch(increse());
      }}>+1</button>

      <button type='button'onClick={()=>{
        dispatch(decrese());
      }}>-1</button>
    </>
  )
}

export default Test1