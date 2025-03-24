import axios from "axios";
import { configs } from "eslint-plugin-react";

/**카테고리 목록조회 */
export const getCategoryList = () => {
  const response = axios.get("/api/categories");
  return response;
};

/**카테고리 등록
 *
 * param : 신규 등록되는 카테고리명(문자ㅕㅇㄹ)
 *
 */
export const insertCategory = (newCateName) => {
  const response = axios.post("/api/categories", { cateName: newCateName });
  return response;
};

/**도서 등록 */
export const insertBook = (bookData) => {
  const fileConfig = { header: { "Content-Type": "multipart/form-data" } };
  
  const response = axios.post("/api/books", bookData, configs);
  return response;
};

