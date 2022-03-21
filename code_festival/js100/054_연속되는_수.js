/**
 * ABOUT
 *
 * DATE: 2022-03-21
 * AUTHOR: jortier
 *
 * COMMENT:
 * 입력 받은 숫자를 순서대로 정렬한다.
 * 0번째 요소부터 반복문을 이용해 다음 요소가 연속되는 숫자인지 확인하면 해결할 수 있다.
 */

function solution(e) {
  e.sort((a, b) => {
    return a - b;
  });

  for(let i = 0; i < e.length - 1; i++){
    if(e[i] + 1 !== e[i + 1]){
      return 'NO';
    }
  }

  return 'YES';
}

const n = prompt('입력해주세요').split(' ').map(n => parseInt(n, 10));

console.log(solution(n));
