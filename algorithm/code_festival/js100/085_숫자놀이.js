/**
 * ABOUT
 *
 * DATE: 2022-03-24
 * AUTHOR: jortier
 *
 * COMMENT:
 * RegExp()는 패턴을 사용해 텍스트를 판별할 때 사용한다.
 */

function solution(n) {
  let answer = '1';

  if(n === 1){
    return 1;
  }

  for(let i = 1; i < n; i++){
    answer = rule(answer);
  }

  return answer;
}

function rule(answer){
  let answerMax = 9;
  let result = '';

  for(let i = 1; i < answerMax; i++){
    let re = new RegExp(i, 'g');
    let count = (answer.match(re) || []).length;

    if(count >= 1){
      result = result + String(i) + String(count);
    }
  }

  return result;
}

const user_input = 7;
console.log(solution(user_input));