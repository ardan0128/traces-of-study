/*
  n = 1 이면 1가지
  1

  n= 2 이면 2가지
  1,1
  2

  n = 3 이면 3가지
  1,1,1
  2,1
  1,2

  n = 4 이면 5가지
  1,1,1,1
  1,1,2
  1,2,1
  2,1,1
  2,2

  n = 5 이면 8가지
  1,1,1,1,1
  2,1,1,1
  1,2,1,1
  1,1,2,1
  1,1,1,2
  2,2,1
  2,1,2
  1,2,2

  n = 6 이면 13가지
  1,1,1,1,1,1
  2,1,1,1,1
  1,2,1,1,1
  1,1,2,1,1
  1,1,1,2,1
  1,1,1,1,2
  2,2,1,1
  2,1,2,1
  2,1,1,2
  1,1,2,2
  1,2,2,1
  1,2,1,2
  2,2,2
*/

function longJump(n){
  var answer = 0;
  
  if(n < 3){
    return n;
  }

  let startNum = 3;
  
  answer = jumpCase(startNum);

  return answer;
}

let jumpCase = (count) => {
  let case1 = 1;
  let case2 = 2;
  let nCase = case1 + case2 % 1234567;
  
  case1 = case2;
  case2 = nCase;

  if(count === n){
    return nCase;
  }

  return jumpCase(count + 1);
}