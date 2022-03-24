/**
 * ABOUT
 *
 * DATE: 2022-03-24
 * AUTHOR: jortier
 *
 * COMMENT:
 * 
 */

function solution(a, t){
  let b = a.slice();
  let c = [];

  for(let i = 0; i < t; i++){
    b.unshift(b.pop());
  }

  for(let i in a){
    c.push(Math.abs(a[i] - b[i]));
  }

  const m = Math.min.apply(null, c);
  let index = c.indexOf(m);

  console.log(`index: ${index}`);
  console.log(`value: ${a[index]}, ${b[index]}`);
}

const l = [10, 20, 25, 27, 34, 35, 39];
const turn = 2;

console.log(solution(l, turn));