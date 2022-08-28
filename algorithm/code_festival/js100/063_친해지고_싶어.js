/**
 * ABOUT
 *
 * DATE: 2022-03-22
 * AUTHOR: jortier
 *
 * COMMENT:
 * 띄어쓰기를 기준으로 배열을 만들어 요소의 가장 앞글자면 연산하면 된다.
 */

function solution(str) {
  let arr = str.split(' ');
  let result = '';

  for(let i = 0; i < arr.length; i++){
    result += arr[i][0];
  }

  return result;
}

console.log(solution('복잡한 세상 편하게 살자'));