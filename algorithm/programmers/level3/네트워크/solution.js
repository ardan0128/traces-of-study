/**
 * ABOUT
 *
 * DATE: 2022-03-23
 * AUTHOR: jortier
 *
 * URL: https://programmers.co.kr/learn/courses/30/lessons/43162
 */

function solution(n, computers) {
  var answer = 0;
  let visited = [false];
  
  function findNetwork(idx){
    visited[idx] = true;
    
    for(let i = 0; i < computers.length; i++){
      if(computers[idx][i] === 1 && !visited[i]){
        findNetwork(i);
      }
    }
  }
  
  for(let i = 0; i < computers.length; i++){
    if(!visited[i]){
      findNetwork(i);
    answer++;
    }
  }
  
  return answer;
}