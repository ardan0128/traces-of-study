/**
 * ABOUT
 *
 * DATE: 2022-03-19
 * AUTHOR: jortier
 *
 * COMMENT:
 * 마지막에 +1을 하면 undifined가 나올 수 있기 때문에 전체 길이의 -1 만큼 반복했다.
 */

let str = 'Javascritp';

for(let i = 0; i < str.length - 1; i++){
  console.log(str[i] + " " + str[i + 1]);
}