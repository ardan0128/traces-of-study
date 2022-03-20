/**
 * ABOUT
 *
 * DATE: 2022-03-20
 * AUTHOR: jortier
 *
 * COMMENT:
 * num을 배열로 변환하고 reduce를 이용하여 합을 구한다.
 * 
 * num을 10으로 나눈 나머지를 더하고 그 몫을 Math.floor를 사용하여 정수부분만 남겨서 반복한다.
 */

function solution(num){
  let a = String(num).split('').reduce((pre, cur) => Number(pre) + Number(cur));
  console.log(a);

  let sum = 0;

  while(num !== 0){
    sum += (num % 10);
    num = Math.floor(num / 10);
  }

  console.log(sum);
}

solution(18234);
solution(3849);
