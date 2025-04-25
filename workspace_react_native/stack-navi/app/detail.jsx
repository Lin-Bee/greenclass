import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useLocalSearchParams, useRouter } from 'expo-router'

const DetailScreen = () => {
  const router = useRouter();
  const {id,age} = useLocalSearchParams();
  return (
    <View>
      <Text>디테일스크린</Text>

      <Text>받은데이터뿌리기</Text>
      <Text>id : {id} age:{age}</Text>


      <Pressable onPress={()=>{router.push('/myPage')}}>
        <Text>마이페이지로 이동</Text>
        <Text>밑에 쌓이고쌓이고 쌓이고 축적됨</Text>
      </Pressable>

      <Pressable onPress={()=>{router.replace('/myPage')}}>
        <Text>마이페이지로 이동 리플레이스</Text>
        <Text>리플레이스는 처음으로 가버리는것이라서 뒤로가기하면 myPage 후 index로 가버림
        완전한 최초가 되도록 창이뜬거 자체가 mypage가 시작이 되어버리는거</Text>
      </Pressable>
    </View>
  )
}

export default DetailScreen

const styles = StyleSheet.create({})