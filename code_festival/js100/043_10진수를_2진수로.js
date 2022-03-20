/**
 * ABOUT
 *
 * DATE: 2022-03-20
 * AUTHOR: jortier
 *
 * COMMENT:
 * n으로 나눈 몫을 계속 n으로 나누고 나머지를 역순으로 하면 n진수로 바꿀 수 있다.
 * 
 */

function solution(num, n){
  let a = []; // 나머지를 담을 배열

  while(num){
    a.push(num % n);
    num = parseInt(num / n, 10);
  }

  a.reverse();

  console.log(a.join(''));
}

solution(25, 2);
