const createMatrix = (village) => {
  const matrix = [];
  village.forEach((line) => {
    const row = [];
    for (let i = 0; i < line.length; i++) row.push(line[i]);
    matrix.push(row);
  });
  return matrix;
};

const gossipProtocol = function (village, row, col) {
  // TODO: 여기에 코드를 작성합니다.
  const R = village.length;
  const C = village[0].length;
  const matrix = createMatrix(village);
  const MOVES = [
    [-1, 0],
    [1, 0],
    [0, 1],
    [0, -1],
  ];
  const MAX_SIZE = R * C;
  const isValid = (row, col) => row >= 0 && row < R && col >= 0 && col < C;
  const queue = Array(MAX_SIZE);
  let front = 0;
  let rear = 0;
  const isEmpty = (queue) => front === rear;
  const enQueue = (queue, pos) => {
    queue[rear] = pos;
    rear = (rear + 1) % MAX_SIZE;
  };
  const deQueue = (queue) => {
    const pos = queue[front];
    front = (front + 1) % MAX_SIZE;
    return pos;
  };

  let cnt = 0;
  enQueue(queue, [row, col]);
  matrix[row][col] = 0;
  while (isEmpty(queue) === false) {
    const [row, col] = deQueue(queue);
    cnt = matrix[row][col];

    MOVES.forEach((move) => {
      const [rDiff, cDiff] = move;
      const nextRow = row + rDiff;
      const nextCol = col + cDiff;
      if (isValid(nextRow, nextCol) && matrix[nextRow][nextCol] === '1') {
        enQueue(queue, [nextRow, nextCol]);
        matrix[nextRow][nextCol] = matrix[row][col] + 1;
      }
    });
  }
  return cnt;
};
