import { axiosInstance } from "./axiosInstance"

export const api_login = (loginInfo) => {
  const response = axiosInstance.post('/member/login', loginInfo);
  return response;
}

export const api_userPage = () => {
  const response = axiosInstance.get('/member/user-page');
  return response;
}