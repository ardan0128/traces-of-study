/**
 * ABOUT
 *
 * DATE: 2022-03-23
 * AUTHOR: jortier
 *
 * URL: https://programmers.co.kr/learn/courses/30/lessons/42586
 */

function solution(progresses, speeds) {
  var answer = [];
  
  while(progresses.length > 0){
    for(let i = 0; i < progresses.length; i++){
      if(progresses[i] <= 100){
        progresses[i] = progresses[i] + speeds[i];
      }
    }
    
    let temp = [];
    
    if(progresses.length === 1){
      temp.push(progresses.splice(0, 1)[0]);
      speeds.splice(0, 1);
    }else{
      while(progresses[0] >= 100){
        temp.push(progresses.splice(0, 1)[0]);
        speeds.splice(0, 1);
      }
    }
    
    if(temp.length !== 0){
      answer.push(temp.length);
    }
  }
  
  return answer;
}