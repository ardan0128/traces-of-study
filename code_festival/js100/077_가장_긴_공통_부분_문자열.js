/**
 * ABOUT
 *
 * DATE: 2022-03-24
 * AUTHOR: jortier
 *
 * COMMENT:
 * 
 */

function solution(string){
  let result = [];

  for(let i = 1; i < string.length + 1; i++){
    for(let j = 0; j < i; j++){
      result.push(string.slice(j, j + string.length - i + 1));
    }
  }

  return result;
}

const inputOne = 'THISISSTRINGS';
const inputTwo = 'THISIS';
const arrayOne = solution(inputOne);
const arrayTwo = solution(inputTwo);
let intersection = arrayOne.fillter(x => arrayTwo.includes(x));

intersection.sort((a, b) => {
  return b.length - a.length;
});

console.log(intersection[0].length);