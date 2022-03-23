/**
 * ABOUT
 *
 * DATE: 2022-03-23
 * AUTHOR: jortier
 *
 * URL: https://programmers.co.kr/learn/courses/30/lessons/42578
 */

function solution(clothes) {
  var answer = 1;
  let obj = {};
  
  for(let i = 0; i < clothes.length; i++){
    obj[clothes[i][1]] = (obj[clothes[i][1]] || 1) + 1;
  }
  
  for(let key in obj){
    answer *= obj[key];
  }
  
  return answer - 1;
}