/**
 * ABOUT
 *
 * DATE: 2022-03-25
 * AUTHOR: jortier
 *
 * COMMENT:
 * 
 */

let stamp = [
  [1, 1, 1, 2],
  [2, 0, 0, 0],
  [1, 1, 1, 1],
  [0, 0, 0, 0],
];
let k = 1;

function solution(stamp, n) {
  let p = [];

  for(let i = 0; i < stamp.length; i++){
    p.push(Array(stamp.length).fill(0));
  }

  p = sum_matrix(p, stamp);

  for(let i = 0; i < n; i++){
    stamp = rotate(stamp);
    p = sum_matrix(p, stamp);
  }

  return p;
}

function rotate(stamp) {
  let rot = [];

  for(let i = 0; i < stamp.length; i++){
    rot.push(Array(4).fill(0));
  }
  
  for(let i = 0; i < stamp.length; i++){
    for(let j = 0; j < stamp.length; j++){
      rot[j][stamp.length - 1 - i] = stamp[i][j];
    }
  }

  return rot;
}

function sum_matrix(p, stamp) {
  for(let i = 0; i < p.length; i++){
    for(let j = 0; j < p[0].length; j++){
      p[i][j] += stamp[i][j];
    }
  }

  return p;
}

console.log(solution(stamp, k));