/**
 * ABOUT
 *
 * DATE: 2022-03-24
 * AUTHOR: jortier
 *
 * COMMENT:
 * 
 */

function solution(d){
  let step = 0;

  for(let i in d){
    if(d[i] === '('){
      step += 1;
    }else if(d[i] === ')'){
      step -= 1;
    }
  }

  if(step !== 0){
    return false;
  }
  
  if(step !== 0){
    return true;
  }
}

while(1){
  const n = prompt('데이터 입력(1), 프로그램 종료(2)');
  if(n === '1'){
    const str = prompt('데이터를 입력하세요').split('');
    
    console.log(solution(str));
  }else{
    break;
  }
}