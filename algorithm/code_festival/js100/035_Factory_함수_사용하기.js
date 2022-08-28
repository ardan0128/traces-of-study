/**
 * ABOUT
 *
 * DATE: 2022-03-19
 * AUTHOR: jortier
 *
 * COMMENT:
 * 고차함수를 이용해서 풀면 된다.
 */

function one(n){
  function two(value){
    const sq = Math.pow(value, n);

    return sq;
  }

  return two;
}

const a = one(2);
const b = one(3);
const c = one(4);

console.log(a);
console.log(b);
console.log(c);

console.log(a(10));
console.log(b(10));
console.log(c(10));