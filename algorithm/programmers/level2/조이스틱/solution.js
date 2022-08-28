/**
 * ABOUT
 *
 * DATE: 2022-03-22
 * AUTHOR: jortier
 *
 * URL: https://programmers.co.kr/learn/courses/30/lessons/42860
 *
 * COMMENT:
 * 상하 이동은 계산을 했는데, 좌우 이동이 해결이 안된다.
 */

function solution(name) {
  var answer = 0;
  let move = name.length - 1;
  
  for(let i = 0; i < name.length; i++){
    answer += Math.min(name[i].charCodeAt() - 65, 91 - name[i].charCodeAt());
  }
  
  let aCount = 0;
  let aStart = 0;
  let tempCount = 0;
  let tempStart = 0;
  
  name.split('').reduce((prev, curr, idx) => {
    if(prev !== curr && curr === 'A'){
      tempCount = 1;
      tempStart = idx;
    }else if(prev === curr){
      tempCount++;
    }
    
    if(tempCount > aCount){
      aCount = tempCount;
      aStart = tempStart;
    }
    
    return curr;
  });
  
  if(aStart === 1){
    move = move - aCount;
  }else if(aStart > 1){
    move = aStart + 1;
  }
  
  console.log(`aStart = ${aStart}, aCount = ${aCount}`);
  
  return answer + move;
}