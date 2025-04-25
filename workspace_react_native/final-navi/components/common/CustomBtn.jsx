import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { colors } from '../../constants/colorConstant'

const CustomBtn = ({label='버튼', btnSize='large', ...props}) => {
  return (
    <View>
      <Pressable {...props}
        style={({ pressed }) => {
          return [
            styles.container,
            styles[btnSize],
            pressed && styles.pressed,
          ];
        }}
      >
        <Text>{label}</Text>
      </Pressable>
    </View>
  )
}

export default CustomBtn

const styles = StyleSheet.create({
  container : {
    borderRadius:8,
    color:  colors.WHITE,
    backgroundColor:colors.GREEN,
    alignItems:'center'
  },
  btnSize:{
    large:{
      height:44,
      width:'100%'
    },
    normal:{
      height:44,
      width:'70%'
    },
    small:{
      height:44,
      width:'40%'
    }
  }
})