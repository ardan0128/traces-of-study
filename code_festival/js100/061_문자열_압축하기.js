/**
 * ABOUT
 *
 * DATE: 2022-03-22
 * AUTHOR: jortier
 *
 * COMMENT:
 * object로 만들어서 단어당 갯수를 세려했지만 연속하지 않는 것도 카운트가 되어 반복은으로 해결했다.
 */

function solution(str) {
  let result = '';
  let word = str[0];
  let count = 0;

  for(let i = 0; i < str.length; i++){
    if(word === str[i]){
      count++;
    }else{
      result += word + count;
      word = str[i];
      count = 1;
    }
  }

  result += word + count;

  return result;
}

console.log(solution('aaabbbbcdddd'));