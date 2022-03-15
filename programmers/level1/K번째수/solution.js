/**
 * ABOUT
 *
 * DATE: 2022-03-15
 * AUTHOR: jortier
 *
 * URL: https://programmers.co.kr/learn/courses/30/lessons/42576
 *
 * COMMENT:
 * 주어진 문제의 입출력 예 설명을 따라하면 풀린다.
 * case 2가 오류가 실패했는데 sort를 명시적으로 해주니 해결됐다.
 */

function solution(array, commands) {
  var answer = [];
  
  for(let i = 0; i < commands.length; i++){
      let arr = array.slice(commands[i][0] - 1, commands[i][1]).sort((a, b) => a - b);
      
      answer.push(arr[commands[i][2] - 1]);
  }
  
  return answer;
}