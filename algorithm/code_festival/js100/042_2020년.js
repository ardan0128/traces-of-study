/**
 * ABOUT
 *
 * DATE: 2022-03-20
 * AUTHOR: jortier
 *
 * COMMENT:
 * Date()를 이용하여 해당 날짜의 인덱스를 구해서 배열에서 가져온다.
 */

function solution(a, b){
  const day = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT'];
  const date = new Date(`2020-${a}-${b}`);
  
  console.log(day[date.getDay()]);
}

solution(4,25);
