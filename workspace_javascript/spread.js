//스프레드 연산자
//배열, 객체에 저장된 여러 데이터를 개별로 흩뿌려주는 문법

const arr1 = [1,2,3];
const arr2 = [4,5];

//[1,2,3,4,5]
//arr1의 3번 4번 요소에다가 arr2의 내용을 넣자;
const arr3 = [...arr1,...arr2];
// ...은 spread 연산자이다
console.log(arr3);

const person = {
  name : 'kim',
  age:20
};

const score = {
  korScore : 50,
  engScore : 100
}

const student = {
  ...person,
  ...score
}

console.log(student);

//find(callback) 배열에서 조건을 만족하는 첫번째 데이터 리턴
//filter(callback) 배열에서 조건을 만족하는 모든 요소로 모아 새로운 배열로 리턴
//map(callback) 배열 데이터를 새로운 형태의 데이터로 가공해 리턴
//reduce(callback) 배열 데이터의 특정조건에 맞는 하나의 값으로 리턴