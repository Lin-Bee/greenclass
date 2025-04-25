import { StyleSheet, Text, View, TextInput } from 'react-native';
import React from 'react';
import { colors } from '@/constants/colorConstant';

const CustomInput = ({ label, isPw = false, ...props }) => {
  return (
    <View style={{ marginBottom: 16 }}>
      {label && <Text style={styles.label}>{label}</Text>}
      <View style={styles.container}>
        <TextInput
          style={styles.input}
          secureTextEntry={isPw}
          placeholderTextColor={colors.GRAY_300}
          {...props}
        />
      </View>
    </View>
  );
};

export default CustomInput;

const styles = StyleSheet.create({
  label: {
    fontSize: 12,
    marginBottom: 6,
    color: colors.GRAY_500,
  },
  container: {
    borderWidth: 1,
    height: 44,
    borderRadius: 8,
    paddingHorizontal: 10,
    justifyContent: 'center',
    borderColor: colors.GRAY_400,
    backgroundColor: '#fff',
  },
  input: {
    fontSize: 16,
    flex: 1,
    height:44,
    color: '#000',
  },
});
