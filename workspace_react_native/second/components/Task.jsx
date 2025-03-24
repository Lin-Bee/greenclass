import { Image, Pressable, StyleSheet, Text, View } from "react-native";
import React, { useEffect, useState } from "react";
import { icon } from "../constants/icons";
import MyTextInput from "./MyTextInput";

const Task = ({ e, cartList, setCartList }) => {
  //수정상태여부
  const [isEditing, setIsEditing] = useState(false);
  //props로 받은건 주면안됨 - 오류날수있음
  const [itemValue, setItemValue] = useState("");

  //인풋에 입력한 데이터를 e가 변경될때해주는친구
  useEffect(() => {
    setItemValue(e.item);
  }, [e]);

  const handleCartList = () => {
    //상품목록에서 현재수정중인 상품의아이디를찾아서
    //찾은상품의 item속성값을 input태그에 입력
    //글자로 바꿔준다.
    // cartList;
    // e.id;
    // itemValue;
    // setCartList();

    // ----- 1번 풀이 시작 ----- //
    // const copyCartList = [...cartList]
    //   for(const cart of copyCartList){
    //     if(cart.id === e.id){
    //       cart.item = itemValue;
    //     }
    //   }
    //   setCartList(copyCartList);
    // ----- 1번 풀이 종료 ----- //

    // ----- 2번 풀이 시작 ----- //
    //cartList.map((e,i)=>{});
    //find : 조건과 일치하는 데이터만 리턴한다.(1번째) - undifinded
    //filter : 조건이 true인 값을 반환하다.(다중값)  - []
    const copyCartList = [...cartList];
    const findCart = cartList.find((cart) => {
      return cart.id === e.id;
    });
    findCart.item = itemValue;
    setCartList(copyCartList);
    // ----- 2번 풀이 종료 ----- //
  };

  return (
    <View style={styles.container}>
      {isEditing ? (
        <>
          <MyTextInput
            style={styles.inputwide}
            //활성화시 자동 커서
            autoFocus={true}
            // 포커스 아웃
            onBlur={() => {
              setItemValue(e.item);
              setIsEditing(false);
            }}
            //완료했을때
            onSubmitEditing={() => {
              handleCartList();
              setIsEditing(false);
            }}
            //변경 후 적용값 등록
            onChangeText={(text) => setItemValue(text)}
            //기본벨류
            value={itemValue}
          />
        </>
      ) : (
        <>
          <Text style={styles.title}>{e.item}</Text>

          <Pressable
            onPress={(e) => {
              setIsEditing(true);
            }}
          >
            <Image source={icon.ICON_EDIT} />
          </Pressable>

          <Pressable onPress={(e) => {}}>
            <Image source={icon.ICON_TRASH} style={styles.img} />
          </Pressable>
        </>
      )}
    </View>
  );
};

export default Task;

const styles = StyleSheet.create({
  container: {
    borderWidth: 0,
    margin: 10,
    backgroundColor: "#fff",
    borderRadius: 4,
    flexDirection: "row",
    alignItems: "center",
    boxShadow: "0 0 10 #ccc",
    padding: 12,
    gap: 8,
  },
  title: {
    flex: 1,
    fontSize: 18,
  },
  img: {
    width: 20,
    height: 20,
  },
  inputwide: {
    flex: 1,
  },
});
