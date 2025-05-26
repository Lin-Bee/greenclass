import axios from "axios";

export const axiosInstance = axios.create({
  baseURL: "http://localhost:8080", // 백엔드 주소
  withCredentials: true,            // 필요 시 쿠키 인증도 함께 처리하기 위한 설정
});

// 요청 인터셉터
axiosInstance.interceptors.request.use(
  config => {
    const token = localStorage.getItem("accessToken"); 
    if (token) {
      config.headers.Authorization = token; 
    }
    return config;
  },
  error => Promise.reject(error)
);

