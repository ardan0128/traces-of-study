/**
 * ABOUT
 *
 * DATE: 2022-03-21
 * AUTHOR: jortier
 *
 * COMMENT:
 * 하노이 탑은 재귀함수를 이용한 알고리즘으로 자주 나오니까 숙지해야한다.
 */

const route = [];

function hanoi(num, start, end, temp) {
  // 원판이 한개일 때에는 바로 옮기면 된다.
  if(num === 1){
    route.push([start, end]);

    return NaN;
  }

  // 원반이 n - 1개를 경유기둥으로 옮긴다.
  hanoi(num - 1, start, temp, end);

  // 가장 큰 원반은 목표기둥으로 옮긴다.
  route.push([start, end]);

  //경유기둥과 시작기둥을 바꾼다.
  hanoi(num - 1, temp, end, start);
}

hanoi(3, 'A', 'B', 'C');
console.log(route);
console.log(route.length);
