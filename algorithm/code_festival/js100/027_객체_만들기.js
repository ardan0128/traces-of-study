/**
 * ABOUT
 *
 * DATE: 2022-03-19
 * AUTHOR: jortier
 *
 * COMMENT:
 * 입력될 때마다 객체에 할당해야하는 것이 아닌
 * 모든 값이 입력받고 객체에 키-값을 할당해도 된다.
 */

function makeObject(students, scores){
  const key = students.split(' ');
  const value = scores.split(' ');
  const obj = {};

  for(let i = 0; i < key.length; i++){
    obj[key[i]] = Number(value[i])
  }

  console.log(obj);
}