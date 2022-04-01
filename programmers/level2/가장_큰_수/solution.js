/**
 * ABOUT
 *
 * DATE: 2022-04-01
 * AUTHOR: jortier
 *
 * URL: https://programmers.co.kr/learn/courses/30/lessons/42746
 * 
 * COMMETS: number를 string으로 변경 후 합치고 비교하는 것이 포인트다.
 */

function solution(numbers) {
  var answer = '';
  
  const arr = numbers.map(number => number + '').sort((a, b) => (b + a) - (a + b));
  
  answer = arr[0] === '0' ? '0' : arr.join('');
  
  return answer;
}