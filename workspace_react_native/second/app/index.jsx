import { Keyboard, StyleSheet, Text, TouchableWithoutFeedback, View } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native'
import './test.css'
import Login from '../components/Login'
import CartList from '../components/CartList'


const MainScreen = () => {
  return (
    //TouchableWithoutFeedback
    // : 터치는 감지하되 아무 반응이없는 컴포넌트
    // : 주로 키보드를 감출때 사용
    // onPress={Keyboard.dismiss} 키보드 숨김코드
    <TouchableWithoutFeedback onPress={Keyboard.dismiss}>
      <SafeAreaView style={styles.mainContainer} >
        {/* <Login/> */}
        <CartList />
      </SafeAreaView>
    </TouchableWithoutFeedback>
  )
}

export default MainScreen

const styles = StyleSheet.create({
  mainContainer:{flex:1}
})