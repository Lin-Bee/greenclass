import { useSelector } from 'react-redux'
import './App.css'
import Test1 from './components/Test1';
import Test2 from './components/Test2';
import Test3 from './components/Test3';

function App() {
//reducer를 이용해 store에 저장된 데이터 불러오기
  // const data1 = useSelector((state)=>{
  //   return state
  // });
  const data = useSelector(state=>state);

  const counter = useSelector((state)=>{
    return state.counter;
  })

  console.log(data);
  console.log(counter);

  return (
    <>
      <p>store에 저장된 데이터 불러오기</p>
      <Test1/>
      <Test2/>
      <Test3/>
    </>
  )
}

export default App
