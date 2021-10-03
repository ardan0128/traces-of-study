function test3(insertEdges, removeEdges) {
  // TODO: 여기에 코드를 작성하세요.
  let maxNum = 0;
  insertEdges.reduce((accu, curr) => {
    let bigger = Math.max(...curr);
    if(maxNum < bigger){
      maxNum = bigger;
    }
  }, maxNum);

  removeEdges.reduce((accu, curr) => {
    let bigger = Math.max(...curr);
    if(maxNum < bigger){
      maxNum = bigger;
    }
  }, maxNum);

  let matrix = new Array(maxNum + 1).fill(0).map(row => new Array(maxNum + 1).fill(0));

  for(let item of insertEdges){
    matrix[item[0]][item[1]] = 1;
    matrix[item[1]][item[0]] = 1;
  }

  for(let item of removeEdges){
    matrix[item[0]][item[1]] = 0;
    matrix[item[1]][item[0]] = 0;
  }

  return matrix;
}

const insertEdges = [
  [0, 3],
  [0, 2],
  [1, 3],
  [2, 1],
];
const removeEdges = [[1, 3], [1, 0]];
let output1 = test3(insertEdges, removeEdges);

console.log(output1);
/**
 * [
 *  [0, 0, 1, 1],
 *  [0, 0, 1, 0],
 *  [1, 1, 0, 0],
 *  [1, 0, 0, 0]
 * ]
 */

const insertEdges2 = [
  [0, 2],
  [2, 4],
  [1, 3],
  [2, 1],
];
const removeEdges2 = [
  [0, 3],
  [2, 1],
  [1, 0],
  [4, 2]
];

let output2 = test3(insertEdges2, removeEdges2);

console.log(output2);
/**
 * [
 *  [0, 0, 1, 0, 0],
 *  [0, 0, 0, 1, 0],
 *  [1, 0, 0, 0, 0],
 *  [0, 1, 0, 0, 0],
 *  [0, 0, 0, 0, 0],
 * ]
 */