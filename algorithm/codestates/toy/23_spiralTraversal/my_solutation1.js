const spiralTraversal = function (matrix) {
  // TODO: 여기에 코드를 작성합니다.
  let result = '';
  
  while(matrix.length !== 0){
    for(let i = 0; i < matrix[0].length; i++){
      result += matrix[0][i];
    }
    matrix.shift();
  }

  return result;
};

let matrix = [
  ['A', 'B', 'C'],
  ['D', 'E', 'F'],
  ['G', 'H', 'I'],
];
let output = spiralTraversal(matrix);
console.log(output); // --> 'ABCFIHGDE'

matrix = [
  ['T', 'y', 'r', 'i'],
  ['i', 's', 't', 'o'],
  ['n', 'r', 'e', 'n'],
  ['n', 'a', 'L', ' '],
];
output = spiralTraversal(matrix);
console.log(output); // --> 'Tyrion Lannister'