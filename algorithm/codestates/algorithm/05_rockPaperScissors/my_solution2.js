function rockPaperScissors (rounds = 3) {
  // TODO: 여기에 코드를 작성합니다.
  let rps = ['rock', 'paper', 'scissors'];
  let result = [];

  if(rounds === 0){
    return result;
  }

  function makeCase(round, item){
    if(round === 0){
      result.push(item);
      return;
    }

    for(let i = 0; i < rps.length; i++){
      makeCase(round - 1, item.concat(rps[i]));
    }
  }

  makeCase(rounds, []);

  return result;
};