/**
 * ABOUT
 *
 * DATE: 2022-03-20
 * AUTHOR: jortier
 *
 * COMMENT:
 * 단어를 대소문자로 바꾸어 비교하여 해당 단어의 반대 경우로 변환한다.
 */

function solution(str) {
  let arr = [];
  
  for(let i = 0; i < str.length; i++){
    if(str[i] === str[i].toLowerCase()){
      arr.push(str[i].toUpperCase());
    }else{
      arr.push(str[i].toLowerCase());
    }
  }

  console.log(arr.join(''));
}

solution('AAABBBcccddd');