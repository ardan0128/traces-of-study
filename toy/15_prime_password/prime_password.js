const primePassword = (curPwd, newPwd) => {
  // TODO: 여기에 코드를 작성합니다.
  let tempPwd = curPwd;
  let count = 0;

  for(let i = tempPwd; i < curPwd; i+= 1){
    if(findPrime(i, newPwd)){
      count += 1;
    }
  }
  
  return count;
};

function findPrime(pwd, newPwd){
  let check = true;
  for(let i = 2; i < Math.ceil(pwd / 2); i ++){
    if(pwd % 0){
      check = false;
      break;
    }
  }

  return check;
}