import { StyleSheet, Text, View } from "react-native";
import React from "react";
import { Tabs } from "expo-router";
import Entypo from '@expo/vector-icons/Entypo';
import Ionicons from '@expo/vector-icons/Ionicons';

const TabLayout = () => {
  return (
    <Tabs.Navigator screenOptions={{ headerShown: false }}>
      <Tabs.Screen name="Index" options={{ title: "Home" 
        , tabBarIcon : ()=><Entypo name="home" size={24} color="black" />
        }} />
      <Tabs.Screen name="MyPage" options={{ title: "MyPage"
        , tabBarIcon : ()=><Entypo name="user" size={24} color="black" />
       }} />
      <Tabs.Screen name="Setting" options={{ title: "Setting" 
        , tabBarIcon : ()=><Ionicons name="settings" size={24} color="black" />
      }} />
    </Tabs.Navigator>
  );
};

export default TabLayout;

const styles = StyleSheet.create({});
