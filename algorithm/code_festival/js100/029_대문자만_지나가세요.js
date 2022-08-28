/**
 * ABOUT
 *
 * DATE: 2022-03-19
 * AUTHOR: jortier
 *
 * COMMENT:
 * 파라미터를 toUpperCase()로 대문자로 변환하고 그것이 파라미터와 같은지를 비교한다.
 */

function checkUpperCase(str){
  let temp = str.toUpperCase();

  if(str === temp){
    return 'YES';
  }else{
    return 'NO';
  }
}