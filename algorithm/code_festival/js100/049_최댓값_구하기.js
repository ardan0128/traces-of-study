/**
 * ABOUT
 *
 * DATE: 2022-03-20
 * AUTHOR: jortier
 *
 * COMMENT:
 * reduce()를 이용해 이전 값과 현재 값을 비교해서 큰 값을 반환하면 된다.
 */

function solution(str) {
  let arr = str.split(' ');
  
  let result = arr.reduce((pre, cur) => {
    pre = Number(pre);
    cur = Number(cur);

    if(pre > cur){
      return pre;
    }

    return cur;
  });

  console.log(result);
}

solution('10 9 8 7 6 5 4 3 2 1');