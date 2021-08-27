function getDirections(matrix, from, to) {
  // TODO: 여기에 코드를 작성합니다.
  let arr = [];
  if(matrix[from][to] === 1){
    return true;
  }
  
  for(let i = 0; i < matrix.length; i++){
    
  }

  return getDirections();
}

const matrix = [
  [0, 1, 0, 0],
  [0, 0, 1, 0],
  [0, 0, 0, 1],
  [0, 1, 0, 0],
];

const result1 = getDirections(matrix, 0, 1);
console.log(result1);

const result2 = getDirections(matrix, 0, 2);
console.log(result2);

const result3 = getDirections(matrix, 0, 3);
console.log(result3);

const result4 = getDirections(matrix, 3, 1);
console.log(result4);

const matrix2 = [
  [0, 1, 0, 1],
  [0, 0, 0, 0],
  [0, 0, 0, 0],
  [0, 0, 1, 0]
];

const result5 = getDirections(matrix2, 0, 2);
console.log(result5);

// 왜 git이 안되냐??