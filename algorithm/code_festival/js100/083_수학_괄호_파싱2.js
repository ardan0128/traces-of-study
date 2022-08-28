/**
 * ABOUT
 *
 * DATE: 2022-03-24
 * AUTHOR: jortier
 *
 * COMMENT:
 * 
 */

function solution(e){
  const m = {
    ')': '(',
    '}': '{'
  };
  let stack = [];

  for(let i = 0; i < e.length; i++){
    if(e[i].include('(') || e[i].includes('{')){
      stack.push(e[i]);
    }else if(m[e[i]]){
      if(stack.length === 0){
        return false;
      }else{
        let t= m[e[i]];

        if(t != stack.pop()){
          return false;
        }
      }
    }
  }

  return stack.length === 0;
}

while(1){
  const n = prompt('데이터 입력(1), 프로그램 종료(2)');
  if(n === '1'){
    const ex = prompt('데이터를 입력하세요').split('');
    
    console.log(solution(ex));
  }else{
    break;
  }
}