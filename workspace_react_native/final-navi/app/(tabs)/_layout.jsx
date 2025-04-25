import { SafeAreaView, StyleSheet, Text, TouchableWithoutFeedback, View } from 'react-native'
import React from 'react'
import { Tabs } from 'expo-router'
import Header from '@/components/Header'

const Tablayout = () => {
  return (
    <SafeAreaView style={styles.container}>
      <Header/>
      
      <View style={styles.tabArea}>
        <Tabs screenOptions={{headerShown:false}}>
          <Tabs.Screen 
            name='(home)'
            option={{title:'홈'}}
          />
          <Tabs.Screen 
          name='(profile)'
          option={{title:'프로필'}}
          listeners={{
            tabPress: (e) => {
              if (!checkAuthForTab('seartch')) {
                // 기본 탭 이벤트 방지
                e.preventDefault();
                // 로그인 페이지로 이동
                router.push('/auth/login');
              }
            }
          }}
          />
          <Tabs.Screen 
          name='(search)'
          option={{title:'검색'}}
          />
        </Tabs>
      </View>
    </SafeAreaView>
  )
}

export default Tablayout

const styles = StyleSheet.create({
  container : {
    flex:1,
  },
  tabArea : {
    flex:1
  }
})