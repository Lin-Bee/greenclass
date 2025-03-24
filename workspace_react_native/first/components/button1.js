import { StyleSheet, Text, View } from 'react-native'
import React from 'react'

const Button1 = () => {
  return (
    <View>
      <Pressable onPress={()=>{
        console.log(1)
      }}>
        <Text>버튼처럼 클릭되는 Pressable</Text>
      </Pressable>
    </View>
  )
}

export default Button1

const styles = StyleSheet.create({})