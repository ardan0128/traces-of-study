/**
 * ABOUT
 *
 * DATE: 2022-03-17
 * AUTHOR: jortier
 *
 * COMMENT:
 * for 문을 사용할 수 있고, 배열로 변경하여 reverse() 함수를 사용할 수 있다.
 */

// 방법 1
let inputString = '거꾸로';
let arr = inputString.split('').reverse().join('');

console.log(arr);

// 방법 2
let outputString = '';

for(let i = inputString.length - 1; 0 <= i; i--){
  outputString += inputString[i];
}

console.log(outputString);