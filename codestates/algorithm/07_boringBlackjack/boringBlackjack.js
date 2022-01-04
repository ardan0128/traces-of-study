function boringBlackjack(cards) {
  // TODO: 여기에 코드를 작성합니다.
  let sum = [];
  let count = 0;

  for(let i = 0; i < cards.length; i++){
    for(let j = i + 1; j < cards.length; j++){
      for(let k = j + 1; k < cards.length; k++){
        sum.push(cards[i] + cards[j] + cards[k]);
      }
    }
  }

  for(let i = 0; i < sum.length; i++){
    let tempbool = false;
    for(let j = 2; j < sum[i]; j++){
      if(sum[i] % j === 0){
        tempbool = true;
      }
    }
    if(!tempbool){
      count++;
    }
  }

  return count;
}
