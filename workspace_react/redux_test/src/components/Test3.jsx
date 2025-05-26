import React, { useState } from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { insertCart } from '../redux/cartSlice';

const Test3 = () => {
  const cart = useSelector(state=>state.cart);
  const dispatch = useDispatch();
  //0보다 cart의 수가 크다면 ...cart의 map돌린 item.catnum을 확인하고+1해라
  const maxCatNum = cart.length > 0 ? Math.max(...cart.map(item => item.catNum)) + 1 : 1;

  const [newTem,setNewTem] = useState({
    catNum: '',
    itemName:'',
    price:''
  });

  const handleTem = (e) =>{
    setNewTem({
      ...newTem,
      [e.target.name] : e.target.value,
      catNum : maxCatNum
    })
  }

  // 

  console.log(cart);
  return (
  
    <>
      <p>카트목록</p>
      <div>
        이름 : <input type="text" name='itemName' value={newTem.itemName} onChange={(e)=>{handleTem(e)}}/> <br />
        가격 : <input type="text" name='price' value={newTem.price} onChange={(e)=>{handleTem(e)}}/>
      </div>
      <button type='button' onClick={()=>{
        dispatch(insertCart(newTem));
      }}>추가</button>
      <ul>
      {
        cart.map((cont,i)=>{
          return (
            <li key={i}>
              <p>{cont.catNum}</p>
              <p>{cont.itemName}</p>
              <p>{cont.price}</p>
          </li>
          )
        })
      }
      </ul>
    </>
  )
}

export default Test3