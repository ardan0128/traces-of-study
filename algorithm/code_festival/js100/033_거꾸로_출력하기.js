/**
 * ABOUT
 *
 * DATE: 2022-03-19
 * AUTHOR: jortier
 *
 * COMMENT:
 * reverse() 함수를 통해 배열을 뒤집고 뒤집은 배열을 join()으로 연결한다.
 */

function changeString(str){
  let strArr = str.split(' ').reverse();

  console.log(strArr.join(' '));
}

changeString('1 2 3 4 5');
changeString('2 4 6 7 8');