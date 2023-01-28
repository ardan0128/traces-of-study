/**
 * ABOUT
 *
 * DATE: 2022-03-20
 * AUTHOR: jortier
 *
 * COMMENT:
 * 버블 정렬은 서로 인접한 두 요소를 검사하여 정렬하는 알고리즘이다.
 */

function bubble(arr) {
  let result = arr.slice(); // 원본 배열 복사

  for (let i = 0; i < result.length - 1; i++) {
    for (let j = 0; j < result.length - i; j++) {
      if (result[j] > result[j + 1]) {
        let temp = result[j];
        result[j] = result[j + 1];
        result[j + 1] = temp;
      }
    }
  }
  return result;
}

const items = prompt('입력해주세요.').split(' ').map((n) => {
  return parseInt(n, 10);
});

console.log(bubble(items));