/**
 * ABOUT
 *
 * DATE: 2022-03-22
 * AUTHOR: jortier
 *
 * URL: https://programmers.co.kr/learn/courses/30/lessons/42883
 *
 * COMMENT:
 * 스택을 이용해서 해결할 수 있다.
 */

function solution(number, k) {
  var answer = '';
  let result = [];
  
  for(let i = 0; i < number.length; i++){
    let now = number[i];
    
    while(k > 0 && result[result.length - 1] < now){
      result.pop();
      k--;
    }
    
    result.push(now);
  }
  
  result.splice(result.length - k, k);
  
  answer = result.join('');
  
  return answer;
}