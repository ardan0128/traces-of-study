// 첫번째 케이스
// replaceAll에서 error 발생
// vscode에서 테스트하면 잘됨
function solution(s){
  var answer = true;

  answer = strReplace(s);
  
  return answer;
}

function strReplace(s){
  if(s.length === 0){
      return true;
  }
  
  if(s.includes('()')){
      return strReplace(s.replaceAll('()', ''));
  }
  
  return false;
}

// 두번째 케이스
// replaceAll에서 replace로 바꿈
// 테스트는 통과되지만 효율성은 테스트 못함
function solution(s){
  var answer = true;

  answer = strReplace(s);
  
  return answer;
}

function strReplace(s){
  if(s.length === 0){
      return true;
  }
  
  if(s.includes('()')){
      return strReplace(s.replace('()', ''));
  }
  
  return false;
}

// 세번째 케이스
// 결국 for문
function solution(s){
  var answer = true;

  if(s[0] === ')'){
      return false;
  }
  
  let left = 0;
  let right = 0;
  for(let i = 0; i < s.length; i += 1){
      if(s[i] === '('){
          left += 1;
      }
      if(s[i] === ')'){
          right += 1;
      }
      
      if(right > left){
          answer = false;
          break;
      }
  }
  
  if(left > right){
      answer = false;
  }
  
  return answer;
}