import { createSlice } from "@reduxjs/toolkit";

//component가 아니므로 js이고 소문자인상태
//const[counter,setCounter] = useState(5); 해당 useState와 유사한 형태임

//여러페이지에서 쓸때는 이렇게 슬라이스로 만들어둠
//상태변경 슬라이스도 로직에 포함이됨
const counterSlice = createSlice({
  name:'counter', //기본 키네임
  initialState:5, //기본 데이터값 (초기값)
  reducers:{
    increse : (state)=>{ //state상태 변수의값
      return state + 1; 
    },
    decrese : (state)=>{
      return state - 1; 
    },
    //매개변수로들어온 데이터만큼 counter값을 변경시키는 함수
    handleCounter : (state,action) =>{
      //ex setNum이라는게 있을때 num을 변경시키는 또다른 값 참고 test1:11
      
      //return state+action.payload
      state.data = state.data+action.payload
    }
  }//상태변경함수들
});

//함수는 아래와 같은 코드로 빼줘야함
export const {increse,decrese,handleCounter} = counterSlice.actions;

export default counterSlice;