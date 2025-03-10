//배열생성문법
const arr1 = new Array(); // 빈 배ㅕㅇㄹ생성
const arr2 = []; //빈배열생성
const arr3 = [1,2,3,4]; //초기값있는배열
const arr4 = [1,5.5,'고기']; //자료형다른매열
const arr5 = [1,5,[1,3,5]]; //자료형다른매열

//배열에 데이터 추가
const arr6 = [];
//const인데 값이 바뀌나용
arr6[0] = 5;
arr6[1] = 8;
arr6.push(50); //배열의 마지막 요소에 데이터 추가
arr6.push("자스랍니다"); //배열의 마지막 요소에 데이터 추가
arr6[2] = 100;

console.log(arr6);
console.log(arr6[3]);

const arr7 = [5,1,[1,4,7]]
console.log(arr7[2][2]);