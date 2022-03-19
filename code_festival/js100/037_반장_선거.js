/**
 * ABOUT
 *
 * DATE: 2022-03-19
 * AUTHOR: jortier
 *
 * COMMENT:
 * 
 */

function classMonitor(str){
  let arr = str.split(' ');
  let result = {};
  let winner = '';

  for(let student of arr){
    if(result[student] === undefined){
      result[student] = 1;
    }else{
      result[student] += 1;
    }
  }

  winner = Object.keys(result).reduce((pre, cur) => result[pre] > result[cur] ? pre : cur);

  console.log(`${winner}(이)가 총 ${result[winner]}표로 반장이 되었습니다.`);
}

classMonitor('원범 원범 혜원 혜원 혜원 혜원 유진 유진');
