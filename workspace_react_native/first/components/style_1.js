import { SafeAreaView, StyleSheet, Text, View } from 'react-native'
import React from 'react'

const Style1 = () => {
  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.v1}>
        <Text>이곳이 스타일이다</Text>
      </View>
      <View style={styles.v3}>
        <Text style={styles.v4}>이곳이 스타일이다</Text>
      </View>
      <View style={styles.v2}>
        <Text>이곳이 스타일이다</Text>
      </View>
    </SafeAreaView>
  )
}

export default Style1
/**
 
 - 리액트네이티브의 컴포넌트들은 모두 flex가 기본값이다
 - direction 의 기본이 column이다.

 */
const styles = StyleSheet.create({
  container:{
    flexDirection: 'row'
  },
  v1:{
    backgroundColor:'red',
    flex: 1
  },
  v2:{
    backgroundColor:'yellow',
    alignItems : 'end',
    flex: 1
  },
  v3:{
     backgroundColor:'#ccc',
     alignItems : 'center',
     flex: 1
     }
})