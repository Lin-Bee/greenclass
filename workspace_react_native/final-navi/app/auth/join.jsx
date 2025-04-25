import { StyleSheet, Text, TextInput, View } from 'react-native';
import React, { useState } from 'react';
import CustomInput from '../../components/common/CustomInput';
import CustomBtn from '../../components/common/CustomBtn';
import { api_join } from '../../apis/memberApi';

const JoinScreen = () => {
  const [joinData, setJoinData] = useState({
    memEmail: '',
    memPw: '',
    memName: '',
  });

  const handleJoinData = (text, name) => {
    setJoinData({
      ...joinData,
      name: text,
    });
  };

  const join = () => {
    console.log(joinData);
    api_join(joinData)
      .then((res) => {
        alert('회원가입이 완료되었습니다.');
      })
      .catch((error) => {
        console.error(error);
        alert('회원가입에 실패했습니다.');
      });
  };

  return (
    
    <View style={styles.container}>
      <View style={styles.inputWrapper}>
        <CustomInput
          label="아이디"
          value={joinData.memEmail}
          onChangeText={(text) => handleJoinData(text, 'memEmail')}
        />
      </View>

      <View style={styles.inputWrapper}>
        <CustomInput
          label="비밀번호"
          isPw = {true}
          value={joinData.memPw}
          onChangeText={(text) => handleJoinData(text, 'memPw')}
        />
      </View>

      <View style={styles.inputWrapper}>
        <CustomInput
          label="이름"
          value={joinData.memName}
          onChangeText={(text) => handleJoinData(text, 'memName')}
        />
      </View>

      <CustomBtn
        label="회원가입"
        btnSize="large"
        onPress={join}
      />
    </View>

  );
};

export default JoinScreen;

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    paddingHorizontal: 24,
    backgroundColor: '#fff',
  },
  inputWrapper: {
    marginBottom: 16,
  },
});

