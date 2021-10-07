function rockPaperScissors (rounds = 3) {
  // TODO: 여기에 코드를 작성합니다.
  let rps = ['rock', 'paper', 'scissors'];
  let result = [];

  function makeCase(round, item){
    if(round === 0){
      result.push(item);
      return;
    }

    for(let i = 0; i < rps.length; i++){
      item.push(rps[i]);
      makeCase(round - 1, item);
    }
  }

  makeCase(rounds, []);

  return result;
};