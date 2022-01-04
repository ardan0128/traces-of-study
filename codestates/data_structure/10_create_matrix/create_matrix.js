function createMatrix(edges) {
	// TODO: 여기에 코드를 작성합니다.

  // edges에서 가장 큰 수를 찾는다.
  // 큰 수로 0으로 채워진 matrix를 만든다.
  // edges에서 directed / undirected로 구분된 것을 1로 채운다.
  // 완성된 matrix를 리턴한다.
  let largeNum = 0;
  for(let i = 0; i < edges.length; i++){
    if(largeNum < edges[i][0]){
      largeNum = edges[i][0];
    }
    if(largeNum < edges[i][1]){
      largeNum = edges[i][1];
    }
  }

  let matrix = [];
  for(let i = 0; i < largeNum + 1; i++){
    matrix.push(Array(largeNum + 1).fill(0));
  }

  for(let i = 0; i < edges.length; i++){
    if(edges[i][2] === 'directed'){
      matrix[edges[i][0]][edges[i][1]] = 1;
    }else if(edges[i][2] === 'undirected'){
      matrix[edges[i][0]][edges[i][1]] = 1;
      matrix[edges[i][1]][edges[i][0]] = 1;
    }
  }

  return matrix;
}