import { Image, Pressable, SafeAreaView, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import Logo from '../assets/images/h1-logo.png'

const Login = (props) => {
  const [id, setId] = useState('');

  return (
    <SafeAreaView style={styles.login}>
      <View style={styles.titArea}>
        <Image source={Logo}/>
      </View>
      <View style={styles.contArea}>
        <Text style={styles.inputSubTxt}>아이디</Text>
        <TextInput style={styles.input} name='' value='id' onChangeText={(e)=>{
          // setId(e.target.value);
          // console.log(e);
          console.log(e.nativeEvent);
          }}/>
        <Text style={styles.inputSubTxt}>비밀번호</Text>
        <TextInput type='password' style={styles.input}/>
        <Pressable style={styles.button} onPress={()=>{alert('로그인됨 환영')}}><Text>로그인</Text></Pressable>
        <Text style={styles.mores}>
          <Pressable style={styles.pres}onPress={()=>{alert('그런기능없다 기억해내라')}}>
            <Text>아이디 비밀번호 찾기 | </Text>
          </Pressable>
          <Pressable style={styles.pres}onPress={()=>{alert('나만쓸수있다')}}>
            <Text>회원가입하기</Text>
          </Pressable>
        </Text>
      </View>
      <View style={styles.copy}>
        <Text>COPY</Text>
      </View>
    </SafeAreaView>
  )
}

export default Login

const styles = StyleSheet.create({
  login:{height:'100%',
    padding:50,
    backgroundColor:'#f5f5f5',
    justifyContent: 'space-between'
  },
  titArea:{
    flex:2,
    alignItems:'center',
    verticalAlign:'center'
  },
  contArea:{
    flex:4,
    paddingTop:30,
    verticalAlign:'center',
  },
  input:{width:'100%',
    paddingTop:'10',
    paddingBottomg:'10',
    marginTop:'10',
    marginBottom:'30',
    borderStyle: 'solid',
    borderColor:'#ccc',
    borderWidth:1,
    borderRadius:5,
    backgroundColor:'#fff',
  },
  button:{width:'100%',
    backgroundColor:'#198562',
    padding:10,
    borderRadius:5,
    alignItems:'center',
    color:'#ffffff'
  },
  mores:{
    paddingTop:'10',
    justifyContent:'center',
    color:'#aaaaaa'
  },
  copy:{
    padding:30,
    alignItems:'center',
  }
})