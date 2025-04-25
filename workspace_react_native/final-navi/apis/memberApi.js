import axios from "axios";
import { Platform } from "react-native";
const baseUrl =
  Platform.OS === "IOS" ? "http://localhost:8080" : "http://10.0.2.2:8080";

export const api_join = (joinData) => {
  const response = axios.post(`${baseUrl}/users/join`, joinData);
  return response;
};

export const api_login = (loginData) => {
  const response = axios.post(`${baseUrl}/members/login`, loginData);
  return response;
};
