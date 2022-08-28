/**
 * ABOUT
 *
 * DATE: 2022-03-21
 * AUTHOR: jortier
 *
 * COMMENT:
 * 열리는 괄호, 닫히는 괄호를 먼저 체크하고,
 * 맞게 열리고 닫히는지 확인하면 해결할 수 있다.
 */

function mathBrackets(e) {
  let count = 0;

  // 괄호 개수가 같지 않으면 false
  for(let i = 0; i < e.length; i++){
    if(e[i] === '('){
      count++;
    }
    
    if(e[i] == ')'){
      count--;
    }
  }

  if(count !== 0){
    return false;
  }

  let brackets = [];
  
  for(let i in e){
    if(e[i] === '('){
      brackets.push('(');
    }

    if(e[i] === ')'){
      if(brackets.length === 0){
        return false;
      }

      brackets.pop();
    }
  }

  return true;
}

const array = prompt('배열을 입력하세요').split(' ');

if(mathBrackets(n) === true){
  console.log('YES');
}else{
  console.log('NO');
}