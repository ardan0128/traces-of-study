const rotateMatrix = function (matrix, spin = 1) {
  // TODO: 여기에 코드를 작성합니다.

  // 회전수를 구해준다.
  // 4번 회전할때마다 360도 회전이기 때문에 회전시키않고 그대로 리턴한다.
  let realSpin = spin % 4;
  if (realSpin === 0) {
    return matrix;
  }

  // matrix가 빈 배열이면 빈 배열을 리턴한다.
  if (matrix.length === 0) {
    return matrix;
  }

  let tempMatrix = matrix.slice();
  let result = [];

  for (let rotate = 0; rotate < realSpin; rotate++) {
    let spinMatrix = new Array(tempMatrix[0].length).fill(0).map(row => new Array(tempMatrix.length).fill(0));

    tempMatrix.reverse();

    for (let i = 0; i < tempMatrix.length; i++) {
      for (let j = 0; j < tempMatrix[i].length; j++) {
        spinMatrix[j][i] = tempMatrix[i][j];
      }
    }
    tempMatrix = spinMatrix.map(item => item.slice());
    result = tempMatrix.slice();
  }

  return result;
};

const matrix = [
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9, 10, 11, 12],
  [13, 14, 15, 16],
];
// console.log(matrix);

// let rotatedMatrix = rotateMatrix(matrix, 1);
// console.log(rotatedMatrix);
// let rotatedMatrix = rotateMatrix(matrix, 2);
// console.log(rotatedMatrix);
// rotatedMatrix = rotateMatrix(matrix, 3);
// console.log(rotatedMatrix);
// rotatedMatrix = rotateMatrix(matrix, 4);
// console.log(rotatedMatrix);

const input = [
  [1, 2, 3, 4, 5, 6],
  [7, 8, 9, 10, 11, 12],
];

let rotatedMatrix = rotateMatrix(input, 3);
console.log(rotatedMatrix);