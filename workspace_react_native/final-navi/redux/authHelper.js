import * as SecureStore from 'expo-secure-store';
import { jwtDecode } from 'jwt-decode';
import { loginReducer, logoutReducer } from './authSlice';


export const getUserSubFromToken = (token) => {
  if (!token) return null;

  try {
    const decoded = jwtDecode(token);

    //falsy:null,undefined,0,빈문자,nan
    //기존 방식(*or연산자 사용) - 왼쪽 데이터가 falsy일때 오른쪽 데이터 실행
    //const username = user.name || 'Guest';

    //Nullish 병합 연산자 사용 - 왼쪽 데이터가 null 또는 undefined일때만 오른족 데이터
    //const username = user.name??'Guest'

    return decoded?.sub || null;
  } catch (error) {
    console.log('jwtDecode 실패:', error);
    return null;
  }
};

export const getUserRoleFromToken = (token) => {
  if (!token) return null;

  try {
    // const decoded = jwtDecode(token);
    //decoded가 null또는 undefined-<undifned
    return decoded?.sub || null;

  } catch (error) {
    console.log('jwtDecode 실패:', error);
    return null;
  }
};