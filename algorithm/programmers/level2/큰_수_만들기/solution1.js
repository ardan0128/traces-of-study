/**
 * ABOUT
 *
 * DATE: 2022-03-22
 * AUTHOR: jortier
 *
 * URL: https://programmers.co.kr/learn/courses/30/lessons/42883
 *
 * COMMENT:
 * 순열조합으로 했는데 효율성이 통과가 되지않는다.
 */

function solution(number, k) {
  var answer = '';
  let result = new Set();
  
  function makeMax(item, idx, numbers){
    if(item.length === numbers.length - k){
      result = set.add(item);
      
      return;
    }

    for(let i = idx; i < numbers.length; i++){
      makeMax(item + numbers[i], i + 1, numbers);
    }
  }  

  makeMax('', 0, number);
  
  answer = `${result}`;
  
  return answer;
}