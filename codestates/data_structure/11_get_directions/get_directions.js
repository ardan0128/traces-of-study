function getDirections(matrix, from, to) {
  // TODO: 여기에 코드를 작성합니다.
  const queue = [from];
  const enqueue = (n) => queue.push(n);
  const dequeue = (n) => queue.shift();
  const isVisited = new Array(matrix.length).fill(false);
  isVisited[from] = true

  while (queue.length > 0) {
    const now = dequeue();

    if (now === to) return true;

    for (let next = 0; next < matrix[now].length; next++) {
      if (matrix[now][next] && !isVisited[next]){
        enqueue(next);
        isVisited[next] = true
      }
    }
  }

  return false;
}

const matrix = [
  [0, 1, 0, 0],
  [0, 0, 1, 0],
  [0, 0, 0, 1],
  [0, 1, 0, 0],
];

const result1 = getDirections(matrix, 0, 1);
const result2 = getDirections(matrix, 0, 2);
const result3 = getDirections(matrix, 0, 3);
const result4 = getDirections(matrix, 3, 1);

const matrix2 = [
  [0, 1, 0, 1],
  [0, 0, 0, 0],
  [0, 0, 0, 0],
  [0, 0, 1, 0]
];

const result5 = getDirections(matrix2, 0, 2);

console.log(result1);
console.log(result2);
console.log(result3);
console.log(result4);
console.log(result5);