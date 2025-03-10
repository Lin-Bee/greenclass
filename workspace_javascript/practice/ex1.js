//1. 정수로 이루어진 배열이 매개변수로 들어오면
//  해당 배열에서 짝수만 출력하는 함수를 선언하고 호출하세요.
const intArray = [5,8,95,45,12,63,71,20];
console.log(intArray);
console.log("짝수를 보여주마");
function test1(intArray){
  for(let i = 0; i<intArray.length; i++){
    if(intArray[i]%2===0){
      console.log(intArray[i]);
    }
  }
}
test1(intArray);
console.log("끝이니라");

// 2. 정수로 이루어진 두 배열이 매개변수로 들어오면
//  두 배열의 모든 요소들의 평균을 리턴하는 함수를 
// 함수표현식으로 구현하고 호출해보세요.
console.log("");
console.log("배열의 평균을 구해주마");

let test2 = function returnNum(a,b){
  // let aSum = 0;
  // for(let i = 0; i<a.length; i++){
  //   aSum += a[i];
  // }
  // console.log(`a배열의 합은 ${aSum} 이다`);
  console.log(`a배열의 합은 ${getArrSum(a)} 이다`);
  console.log(`b배열의 합은 ${getArrSum(b)} 이다`);

  console.log(`a의 평균은 ${getArrSum(a)/a.length}이고, b의 평균은 ${getArrSum(b)/b.length}이다`)

  return console.log(`두 배열의 평균 ${(getArrSum(a)+getArrSum(b))/(a.length+b.length)}`);

}
test2([1,5,9,3,51],[5,6,42,1,10,31]);

//2-2 두개의 형태를 하나의 function으로 구분해주는법
console.log("");
console.log("배열의 평균을 구해주마");
function getArrSum(arr){
  let arrSum = 0;
  for(const e of arr){
    arrSum = arrSum+e;
  }
  return arrSum;
}
test2([1,2,5],[5,6]);


//3. 문자열로 이루어진 배열이 매개변수로 전달되면
// 배열 각 요소의 글자 중 길이가 가장 긴 문자열을 리턴하는 함수를 화살표함수로 구현하고 호출해보세요.
console.log("");
console.log("길이가 가장 긴 문자열을 보여주마");

const long = (longtest) =>{
  let index = 0;
  for(let i =0; i<longtest.length;i++){
    if(longtest[i].length>longtest[index].length){
      index = i;
    }
  }
  return console.log(longtest[index]);
}

long(["고기","고기고기스","육지","물고기","사람고기","강사님"]);

console.log("끝이니라");

//4. 첫번째 매개변수로 전달된 정수의 배수를
//  두번째 매개변수의 갯수만큼 갖는
//  배열을 리턴하는 함수를 선언하고 호출해보세요.

console.log("");
console.log("설명하기 그런데 a랑 b가 있으면 a*b만큼 배열이다");

const test4 = (a,b) =>{
  let test4arr = new Array;
  for(let i=1; i<b+1; i++){
    test4arr.push(a*i);
  }
  return test4arr;
}

console.log(test4(2,4));

console.log("끝이니라");