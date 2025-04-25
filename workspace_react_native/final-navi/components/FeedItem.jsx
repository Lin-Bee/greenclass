import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { colors } from '../../constants/colorConstant'
import AntDesign from '@expo/vector-icons/AntDesign';
import FontAwesome5 from '@expo/vector-icons/FontAwesome5';

const FeedItem = () => {
  return (
    <>
      <View style={styles.feedContainer}>
        <Text style={styles.title}>글제목</Text>
        <Text style={styles.content}>글내용</Text>
      </View>
      <View style={styles.menuContainer}>
        <Pressable style={styles.menu}>
          <AntDesign name="heart" size={24} color="black" />
          <Text>1</Text>
        </Pressable>
        <Pressable style={styles.menu}>
          <FontAwesome5 name="comment-dots" size={24} color="black" />
          <Text>1</Text>
        </Pressable>
        <Pressable style={styles.menu}>
          <AntDesign name="eyeo" size={24} color="black" />
          <Text>1</Text>
        </Pressable>
    </View>
    </>
  )
}

export default FeedItem

const styles = StyleSheet.create({
  feedContainer:{
    padding:16
  },
  menuContainer:{
    flexDirection:'row',
    justifyContent:'space-around',
    alignItems:'center',
    borderTopWidth:1,
    borderTopColor:colors.GRAY_200
  },
  menu :{
    flexDirection:'row',
    justifyContent:'center',
    alignItems:'center',
    paddingVertical:16,
    gap:5,
    width:'33.3%',
  },
  title:{
    fontSize:16,
    marginBottom:12
  },
  content:{

  }
})