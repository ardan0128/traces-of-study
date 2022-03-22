/**
 * ABOUT
 *
 * DATE: 2022-03-23
 * AUTHOR: jortier
 *
 * URL: https://programmers.co.kr/learn/courses/30/lessons/43165
 */

function solution(numbers, target) {
  var answer = 0;
  
  const targetNum = (idx, sum) => {
    if(idx === numbers.length){
      if(sum === target){
        answer += 1;
      }
    
      return;
    }
      
    targetNum(idx + 1, sum + numbers[idx]);
    targetNum(idx + 1, sum - numbers[idx]);
  }
  
  targetNum(0, 0);
  
  return answer;
}