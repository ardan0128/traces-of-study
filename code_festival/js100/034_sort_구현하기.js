/**
 * ABOUT
 *
 * DATE: 2022-03-19
 * AUTHOR: jortier
 *
 * COMMENT:
 * 문제를 잘못 읽어서 고생했다.
 * 주어진 순서와 정렬했을 때 순서가 같은지 비교하면 된다.
 */

function checkHeight(str){
  let strArr = str.split(' ').sort((a, b) => a - b).join(' ');

  if(str === strArr){
    return 'YES';
  }else{
    return 'NO';
  }
}

