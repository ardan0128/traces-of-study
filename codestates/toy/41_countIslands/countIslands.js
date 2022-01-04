const countIslands = function (grid) {
  // TODO: 여기에 코드를 작성합니다.
  if(grid.length === 0){
    return 0;
  }

  const result = [];
  const island = [];

  for(let i = 0; i < grid.length; i++){
    for(let j = 0; j < grid[i].length; j++){
      if(grid[i][j] === '1'){
        island.push([i, j]);
      }
    }
  }

  const tempIsland = island.slice();
  console.log(island);

  tempIsland.shift();

  

  while(tempIsland.length !== 0){
    tempIsland.unshift();
    console.log(tempIsland);
  }
  
  // for(let i = 0; i < island.length; i++){
  //   let islandX = island[i][0];
  //   let islandY = island[i][1];

  //   let tempIsland = [island[i]];
  //   for(let j = i + 1; j < island.length; j++){
  //     if(islandX + 1 === island[j][0] || islandY + 1 === island[j][1]){
  //       tempIsland.push(island[j]);
  //     }
  //   }

  //   result.push(tempIsland);
  // }

  console.log(result);
};

const result = countIslands([
  ['0', '1', '1', '1', '0'],
  ['0', '1', '0', '0', '0'],
  ['0', '0', '0', '1', '0'],
  ['1', '1', '0', '1', '0'],
  ['1', '1', '0', '1', '0'],
]);