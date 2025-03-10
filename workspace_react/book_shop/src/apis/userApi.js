import axios from "axios";

/*회원가입*/
export const joinUser = (joinData) => {
  const response = axios.post("/api/users", joinData);
  return response;
};

/*로그인*/
// export const login = (loginInfo) =>{
//   const response = axios.post('/api/users/login',loginInfo);
//   return response;
// }
export const login = (loginData) =>{
  const response = axios.get('/api/users/login',
                              {params:loginData});
  return response;
}
