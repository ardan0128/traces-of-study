/**
 * ABOUT
 *
 * DATE: 2022-03-16
 * AUTHOR: jortier
 *
 * URL: https://programmers.co.kr/learn/courses/30/lessons/42576
 *
 * COMMENT:
 * 기존에 풀었단 방법 말고 다른 방법으로 풀어보았다.
 */

function solution(n, lost, reserve) {
  var answer = 0;
  
  let student = new Array(n).fill(0);
  
  for(let a of lost){
    student[a - 1] -= 1;
  }
  
  for(let a of reserve){
    student[a - 1] += 1;
  }
  
  for(let i = 0; i < student.length; i++){
    if(student[i] === 1){
      if(student[i - 1] < 0){
        student[i] -= 1;
        student[i - 1] += 1;
      }else if(student[i + 1] < 0){
        student[i] -= 1;
        student[i + 1] += 1;
      }
    }
  }
  
  for(let i = 0; i < student.length; i++){
    if(student[i] > -1){
      answer++;
    }
  }
  
  return answer;
}