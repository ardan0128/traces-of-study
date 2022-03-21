/**
 * ABOUT
 *
 * DATE: 2022-03-21
 * AUTHOR: jortier
 *
 * COMMENT:
 * padStart()는 주어진 길이만큼 원래 문자열의 왼쪽부터 주어진 문자열로 채운다.
 * 주어진 문자열을 포함한 길이
 * hi가 입력이 됐다면 hi를 포함한 문자열 길이만큼 문자열로 채운다.
 * 
 * padEnd()는 주어진 길이만큼 원래 문자열의 오른쪽부터 주어진 문자열로 채운다.
 */

const str = prompt('문자열을 입력해주세요.');
const n = 25 + parseInt((str.length / 2), 10);
const a = str.padStart(n, '=');

console.log(a.padEnd(50, '='));