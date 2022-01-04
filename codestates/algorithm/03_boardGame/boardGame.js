function boardGame(board, operation) {
  // TODO: 여기에 코드를 작성하세요.
  let width = 0;
  let height = 0;
  let score = 0;

  for(let i = 0; i < operation.length; i++){
    if(operation[i] === 'U'){
      height -= 1;
    }
    if(operation[i] === 'L'){
      width -= 1;
    }
    if(operation[i] === 'D'){
      height += 1;
    }
    if(operation[i] === 'R'){
      width += 1;
    }

    if(width < 0 || width >= board[0].length || height < 0 || height >= board.length){
      return 'OUT';
    }

    score += board[height][width];
  }

  return score;
};