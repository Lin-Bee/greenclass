import { StyleSheet, Text, TextInput, View } from 'react-native'
import React from 'react'

const MyTextInput = ({placeholder='',...props}) => {
  return (
    <TextInput 
      style={styles.input}
      placeholder={placeholder}
      //secureTextEntry // 비밀번호 type passwords
      returnKeyType='next' //자판UI의 완료를 -> 다음으로 변경
      autoCapitalize='none' //자동 대문자변환 비활성화
      spellCheck={false} //맞춤법검사 비활성화
      autpCorrect={false} //자동수정을 비활성화
      {...props} //받아올거 미리선언해놓기
    />
  )
}

export default MyTextInput

const styles = StyleSheet.create({
  input:{
    borderWidth:1,
    borderColor:'#333'
  }
})
