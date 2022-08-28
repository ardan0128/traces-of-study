/**
 * ABOUT
 *
 * DATE: 2022-03-17
 * AUTHOR: jortier
 *
 * COMMENT:
 * 배열의 요소를 지우는 방법은 다양하게 있으니까 손맛에 맞게 사용한다.
 */

function solution1() {
  var nums = [100, 200, 300, 400, 500];

  return nums.slice(0, 3);
}

function solution2() {
  var nums = [100, 200, 300, 400, 500];
  nums.pop();
  nums.pop();

  return nums;
}