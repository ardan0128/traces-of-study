/**
 * ABOUT
 *
 * DATE: 2022-03-23
 * AUTHOR: jortier
 *
 * COMMENT:
 * 반복문을 이용해서 번갈아가면서 배열에 추가하면 된다.
 */

const a = [1, 2, 3, 4];
const b = ['a', 'b', 'c', 'd'];
let c = [];

a.forEach((e, i) => {
  if(i % 2 === 0){
    c.push([e, b[i]]);
  }else{
    c.push([b[i], e]);
  }
});

console.log(c);