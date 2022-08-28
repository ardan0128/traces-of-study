/**
 * ABOUT
 *
 * DATE: 2022-03-24
 * AUTHOR: jortier
 *
 * COMMENT:
 * 
 */

function solution(chars){
  let combi = [];

  const f = (prefix, chars) => {
    for(let i = 0; i < chars.length; i++){
      combi.push(prefix + chars[i]);

      f(prefix + chars[i], chars.slice(i + 1));
    }
  }

  f('', chars);

  const result = combi.filter(x => x.length === n);
  
  console.log(result);

  return result.length;
}

const arr = ['ㄱ', 'ㄴ', 'ㄷ', 'ㄹ'];
const n = 3;

console.log(solution(arr));