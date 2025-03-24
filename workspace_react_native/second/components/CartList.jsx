
import { Image, Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import { icon } from '../constants/icons'
import { data } from '../data/data'
import Task from './Task'


const CartList = () => {
  const [cartList, setCartList] = useState(data);
  const [newItem, setNewItem] = useState('');

  //상품이 수정상태인지, 수정상태가 아닌지 판단하는 변수
  //const [isEditing, setIsEditing] = useState([false,false,false]);
  //list에서라면 매번돌려저ㅜ야함

  const aaa = cartList.forEach((e, i) => {
    console.log(e);
  });
  console.log(aaa);

 // cartList.map((e, i) => {});dddd

  return (
    <View>
      <Text>CartList</Text>
      {/* <Image source={icon_edit} />
      <Image source={icon_delete} />
      <Image source={icon.ICON_EDIT} /> */}

      {
        cartList.map((e, i) => {
          return (
            <Task key={i} e={e} cartList={cartList} setCartList={setCartList}/>
          )
        })
      }

      <View>
        <TextInput 
          style={styles.input}
          value={newItem}
          onChangeText={text => setNewItem(text)}
          //키보드의 완료, enter 키를 눌렀을 때 실행하는 이벤트
          onSubmitEditing={() => {
            //max id + 1 구하기
            let max = cartList[0].id;
            for(const e of cartList){
              if(max < e.id){
                max = e.id;
              }
            }

            const max1 = Math.max(...cartList.map((e, i) => {return e.id}));


            //저장할 객체를 생성
            const newData = {
              id : max + 1,
              item : newItem
            };

            setCartList([...cartList, newData]);
            setNewItem('');

          }}
        />
      </View>

    </View>
  )
}

export default CartList

const styles = StyleSheet.create({
  input:{
    borderWidth:1
  }
})