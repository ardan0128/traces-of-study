/**
 * ABOUT
 *
 * DATE: 2022-03-24
 * AUTHOR: jortier
 *
 * COMMENT:
 * 
 */

const name = '손오공 야무치 베지터 피콜로'.split(' ');
const point = '70 10 55 40'.split(' ');
const point_int = point.map(a => parseInt(a, 10));

function solution(name, point) {
  let temp = [];

  for(let i of name){
    let obj = {};
    obj['name'] = i;
    obj['value'] = point[name.indexOf(i)];

    temp.push(obj);
  }

  temp.sort((a, b) => {
    return a.value < b.value ? 1 : a.value > b.value ? -1 : 0;
  });

  let result = {};

  for(let i of temp){
    result[i['name']] = temp.indexOf(i) + 1;
  }

  return result;
}

console.log(solution(name, point_int));