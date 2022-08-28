/**
 * ABOUT
 *
 * DATE: 2022-03-17
 * AUTHOR: jortier
 *
 * COMMENT:
 * object는 키가 중복이 될 수 없어서 같은 키로 입력된 것 중에 나중에 입력 된 것이 할당된다.
 */

/**
 * 문제)
 * 자바스크립트 객체를 다음과 같이 만들었다.
 * 출력값을 입력하시오. (출력값은 공백을 넣지 않습니다.)
 */

var d = {
  'height': 180,
  'weight': 78,
  'weight': 84,
  'temperature': 36,
  'eyesight': 1,
}

console.log(d['weight']);

// 답: 84