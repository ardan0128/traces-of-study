/**
 * ABOUT
 *
 * DATE: 2022-03-22
 * AUTHOR: jortier
 *
 * COMMENT:
 * 3을 빼다가 7로 나뉘어지면 7로 나눈다.
 * 그렇지 않으면 -1을 반환한다.
 */

function solution(n) {
  let result = 0;

  while(true){
    if(n % 7 === 0){
      result += parseInt(n / 7, 10);
      
      console.log(result);
      
      break;
    }

    n -= 3;
    result += 1;

    if(n < 0){
      console.log(-1);
      break;
    }
  }
}

console.log(solution(25));