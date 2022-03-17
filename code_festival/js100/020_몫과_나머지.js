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

let numbers = '10 3';
let a = numbers.split(' ')[0];
let b = numbers.split(' ')[1];

console.log(`${parseInt(a / b)}, ${a % b}`);
