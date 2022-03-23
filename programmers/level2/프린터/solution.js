/**
 * ABOUT
 *
 * DATE: 2022-03-23
 * AUTHOR: jortier
 *
 * URL: https://programmers.co.kr/learn/courses/30/lessons/42587
 */

function solution(priorities, location) {
  var answer = 0;
  
  let max;
  
  while(true){
    max = Math.max.apply(null, priorities);
    let n = priorities.shift();
    
    if(n === max){
      answer++;
      
      if(location === 0){
        return answer;
      }
    }else{
      priorities.push(n);
    }
    
    location--;
    
    if(location == -1){
      location = priorities.length - 1;
    }
  }
}