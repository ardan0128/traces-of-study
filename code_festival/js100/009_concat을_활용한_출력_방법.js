/**
 * ABOUT
 *
 * DATE: 2022-03-17
 * AUTHOR: jortier
 *
 * COMMENT:
 * 문자열에도 concat을 쓸 수 있다는 것을 알게 됐다.
 */

/**
 * 문제)
 * 다음 소스 코드를 완성하여 날짜와 시간을 출력하시오.
 */

var year = '2022';
var month = '03';
var day = '17';
var hour = '21';
var minute = '42';
var second = '19';

var result = year.concat('/', month).concat('/', day).concat(' ', hour).concat(':', minute).concat(':', second);

console.log(result);