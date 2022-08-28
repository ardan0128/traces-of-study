/**
 * ABOUT
 *
 * DATE: 2022-03-17
 * AUTHOR: jortier
 *
 * COMMENT:
 * splice를 통해 요소를 추가할 수 있다.
 */

function solution1() {
  var arr = [200, 100, 300];

  return arr.splice(2, 0, 10000);
}