let tiling = function (n) {
  // TODO: 여기에 코드를 작성합니다.
  let dummy = [0, 1, 2];

  let act = i => {
    if(dummy[i] !== undefined){
      return dummy[i];
    }
    if(i <= 2) {
      return dummy[i];
    }
    dummy[i] = act(i - 1) + act(i - 2);
    
    return dummy[i];
  }

  return act(n);
};
