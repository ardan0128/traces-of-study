/**
 * ABOUT
 *
 * DATE: 2022-03-24
 * AUTHOR: jortier
 *
 * COMMENT:
 * 
 */

function solution(chars) {
  let permute = [];

  const f = (prefix, chars) => {
    for(let i = 0; i < chars.length; i++){
      permute.push(prefix + chars[i]);

      if(permute.indexOf(chars[i] + prefix) === -1){
        permute.push(chars[i] + prefix);
      }

      f(prefix + chars[i], chars.slice(i + 1));
    }
  };

  f('', chars);

  let result = permute.filter(x => x.length === len);
  result.sort((a, b) => b - a);

  return result[0];
}

const num = prompt('숫자를 입력하세요').split('');
const len = parseInt(prompt('몇 개의 수를 선택하시겠습니까?'),10);
console.log(solution(num));