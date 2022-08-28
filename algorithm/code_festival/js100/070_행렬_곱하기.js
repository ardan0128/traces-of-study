/**
 * ABOUT
 *
 * DATE: 2022-03-22
 * AUTHOR: jortier
 *
 * COMMENT:
 * 행렬의 곱하기 연산을 이용하여 해결할 수 있다.
 */

function solution(a, b) {
  let c = [];
  const len = a[0].length;

  if (len === b.length){
    for(let i = 0; i < len; i++){
      let row = [];

      for(let j = 0; j < len; j++){
        let x = 0;

        for(let k = 0; k < len; k++){
          console.log(`a[${i}][${k}] = ${a[i][k]}, b[${k}][${j}] = ${b[k][j]}`);
          x += a[i][k] * b[k][j];
        }

        row.push(x);
      }

      c.push(row);
    }

    return c;

  } else {

  return -1;
  }
}

const a = [[1, 2], [2, 4]];
const b = [[1, 0], [0, 3]];

console.log(solution(a, b));