/**
 * ABOUT
 *
 * DATE: 2022-03-22
 * AUTHOR: jortier
 *
 * COMMENT:
 * 사람 수를 늘려가면서 악수한 횟수와 맞는지 비교한다.
 */

function solution(n) {
  let people = 0;
  let handShake = 0;
  let temp = 0;

  while(true){
    handShake = parseInt((people * (people - 1)) / 2, 10);

    if(n < handShake){
      break;
    }

    temp = handShake;
    people += 1;
  }

  return [parseInt(n - temp, 10), people];
}

const num = 59;

console.log(solution(num));