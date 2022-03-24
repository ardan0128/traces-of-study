/**
 * ABOUT
 *
 * DATE: 2022-03-24
 * AUTHOR: jortier
 *
 * COMMENT:
 * 
 */

function solution(n, k){
  let index = 0;
  let q = [];

  for(let i = 0; i < n; i++){
    q.push(i + 1);
  }

  while(q.length){
    if(index > q.length - 1){
      index -= q.length;
    }

    q.splice(index, 1);
    index += k;
    index -= 1;
  }

  return q;
}

const n = 6;
const k = 3;

console.log(solution(n, k));