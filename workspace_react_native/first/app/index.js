import { SafeAreaView, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Pressable } from 'react-native'
import Style1 from '../components/style_1'
import Button1 from '../components/button1'
import Login from '../components/login'
//rnfes
//react native function export styles
const MainScreen = () => {
  return (
      <View>
        <Login/>
      </View>
  )
}

export default MainScreen

const styles = StyleSheet.create({})