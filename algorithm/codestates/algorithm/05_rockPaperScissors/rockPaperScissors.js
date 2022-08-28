function rockPaperScissors(rounds) {
  // TODO: 여기에 코드를 작성합니다.
  rounds = rounds || 3;
  let rps = ['rock', 'paper', 'scissors'];
  let result = [];

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