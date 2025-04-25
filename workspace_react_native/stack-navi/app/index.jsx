import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useRouter } from 'expo-router'

const HomeScreen = () => {
  const router = useRouter();
  return (
    <View>
      <Text>index</Text>

      <Pressable onPress={()=>{router.push('/detail')}}>
        <Text>디테일로 이동</Text>
      </Pressable>

      <Pressable onPress={()=>{router.push({
        pathname : '/detail',
        params : {id:'react', age:30}
        })
      }}>
        <Text>디테일로 이동(데이터가져가기)</Text>
      </Pressable>
    </View>
  )
}

export default HomeScreen

const styles = StyleSheet.create({})