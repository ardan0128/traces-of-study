/**
 * ABOUT
 *
 * DATE: 2022-03-18
 * AUTHOR: jortier
 *
 * COMMENT:
 * 문제에 공백으로 나누어진 두 수라고 하여 문자열에 split을 사용하여 나누었다.
 * 거듭연산자(**)를 사용할 수 있고, Math.pow()를 사용할 수 있다.
 */

let numbers = '2 10';
let arr = numbers.split(' ');
let a = Number(arr[0]);
let b = Number(arr[1]);

console.log(a ** b);
console.log(Math.pow(a, b));
