/**
 * ABOUT
 *
 * DATE: 2022-03-18
 * AUTHOR: jortier
 *
 * COMMENT:
 * 매개 변수를 배열로 만든다.
 * reduce() 함수를 이용해 총합을 구한다.
 * 배열의 길이로 총합을 나눠서 평균을 구한다.
 * Math.floor을 이용해 소수점을 버린다.
 */

function limitHeight(score1, score2, score3) {
  let scores = [score1, score2, score3];
  let total = scores.reduce((pre, cur) => pre + cur, 0);
  let average = Math.floor(total / scores.length);
  
  return average;
}
