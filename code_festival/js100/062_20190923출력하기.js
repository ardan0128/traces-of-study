/**
 * ABOUT
 *
 * DATE: 2022-03-22
 * AUTHOR: jortier
 *
 * COMMENT:
 * 해답에서 정규식을 사용했는데 그럴 필요까지 있나 싶다.
 */

const user_s = 'aacdddddddddfffffffffgghhh';
let result_s = '';

console.log(
  `${user_s.match(/a/g).length}
  ${Number(user_s.match(/b/g))}
  ${user_s.match(/c/g).length}
  ${user_s.match(/d/g).length}
  ${Number(user_s.match(/e/g))}
  ${user_s.match(/f/g).length}
  ${user_s.match(/g/g).length}
  ${user_s.match(/h/g).length}`
  );