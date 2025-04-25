import { Pressable, StyleSheet, Text, View } from "react-native";
import React from "react";

import FeedItem from "../../../components/FeedItem";


const HomeScreen = () => {
  return (
    <View style={styles.container}>
      <FeedItem/>
    </View>
  );
};

export default HomeScreen;

const styles = StyleSheet.create({
  container:{
    flex:1,
    backgroundColor:'white',
  },
  
  
});
