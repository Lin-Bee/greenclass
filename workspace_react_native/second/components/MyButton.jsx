import { Button, Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { COLOR } from '../constants/colors'

const MyButton = ({size='normal',onPress,title='Button'}) => {
  return (
    // <Pressable style={[styles.btnContainer, styles[size]]}>
    <Pressable style={(e)=>{
      console.log(e)
      return [styles.btnContainer, styles[size], e.pressed&&styles.pressed]
    }} onPress={()=>{onPress()}}>
      <Text style={styles.btn}>{title}</Text>
    </Pressable>
  )
}

export default MyButton

const styles = StyleSheet.create({
  btnContainer:{
    borderWidth:0,
    width:'30%',
    height:44,
    borderRadius:6,
    backgroundColor:COLOR.BTN_BG_COLOR,
    justifyContent:'center',
  },
  btn:{
    textAlign:'center',
    paddingVertical:10,
    paddingHorizontal:10,
    color:'white'
  },
  normal:{
    width:'30%'
  },
  large:{
    width:'100%'
  },
  pressed:{
    opacity:0.8
  }
})