/**
 * ABOUT
 *
 * DATE: 2022-03-21
 * AUTHOR: jortier
 *
 * COMMENT:
 * slice()는 원본을 수정하지 않고 복사해온다.
 * 따라서 끝에 세자리를 빼고 앞자리를 모두 가져오고, ','를 붙이고 끝에 3자리를 다시 붙인다.
 */

// 내장함수 사용
const n = prompt('숫자를 입력해주세요.');

parseInt(n, 10);

console.log(n.toLocaleString()); // Chrome console에서는 콤마가 찍히지 않는다.

// 재귀함수 사용
function comma(s) {
  if(s.length <= 3){
    return s;
  }else{
    return comma(s.slice(0, s.length -3)) + ',' + s.slice(s.length - 3);
  }
}

const s = prompt('숫자를 입력해주세요.');
console.log(comma(s));