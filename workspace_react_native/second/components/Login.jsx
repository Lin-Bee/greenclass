import { StyleSheet, Text, TextInput, View } from "react-native";
import React, { useState } from "react";
import MyTextInput from "./MyTextInput";
import MyButton from "./MyButton";

const Login = () => {
  const printHello = () => {
    console.log("안녕하세요");
  };
  const [data, setData] = useState({
    id: "",
    pw: "",
  });
  const changeData = (text, name) => {
    setData({
      ...data,
      [name]: text.nativeEvent.text,
    });
  };

  const alretHello = () => {
    alert(info);
  };
  return (
    <View>
      <Text>Login</Text>
      <MyTextInput
        value={data.id}
        onChange={(text) => {
          changeData(text, "id");
        }}
      />
      <MyTextInput
        value={data.pw}
        onChange={(text) => {
          changeData(text, "pw");
        }}
      />
      <MyTextInput placeholder={"bbb"} />

      {/* alert으로 안녕 */}
      <MyButton
        size="large"
        onPress={() => {
          alretHello();
        }}
      />
      {/* console로 안녕 */}
      <MyButton
        onPress={() => {
          printHello();
        }}
      />
      <MyButton
        title="데이터확인"
        onPress={() => {
          alert(`id=${data.id},pw=${data.pw}`);
        }}
      />
    </View>
  );
};

export default Login;

const styles = StyleSheet.create({});
