/**
 * ABOUT
 *
 * DATE: 2022-03-20
 * AUTHOR: jortier
 *
 * COMMENT:
 * getTime()은 1970년 1월 1일 0시 0분 0초부터 지금까지 흐른 시간을 천분의 1초 단위(ms)로 반환한다.
 * 
 * 문제에서 getTime()을 사용하라고 했지만 getFullYear()를 사용하면 현재 연도를 바로 출력할 수 있다.
 */

const d = new Date();
let year = d.getTime();
year = Math.floor(year / (3600 * 24 * 365 * 1000)) + 1970;
console.log(year);

console.log(d.getFullYear());
