const isSubsetOf = function (base, sample) {
  // TODO: 여기에 코드를 작성합니다.
  let baseArr = base.sort((a, b) => a - b);
  let sampleArr = sample.sort((a, b) => a - b);
  let inum = 0;
  
  for(let i of sample){  
    if(base.indexOf(i, inum) !== -1){
      inum = base.indexOf(i, inum);
    }else{
      return false;
    }
  }

  return true;
};
