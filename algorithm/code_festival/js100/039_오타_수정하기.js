/**
 * ABOUT
 *
 * DATE: 2022-03-19
 * AUTHOR: jortier
 *
 * COMMENT:
 * replaceAll()과 정규식을 통해 바꿀 수 있다.
 */

function changeChar(str){
  let result = str.replaceAll('q', 'e');

  console.log(result);

  // 정규식
  console.log(str.replace(/q/gi, 'e'));
}

changeChar('querty');
changeChar('hqllo my namq is hyqwon');
