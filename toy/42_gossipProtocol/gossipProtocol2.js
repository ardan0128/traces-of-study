const createMatrix = (village) => {
  const matrix = [];
  village.forEach((line) => {
    const row = [];
    for (let i = 0; i < line.length; i++) row.push(line[i]);
    matrix.push(row);
  });
  return matrix;
};

const gossipProtocol2 = function (village, num) {
  // TODO: 여기에 코드를 작성합니다.
  const villageMap = createMatrix(village);
  const allAgent = [];
  const villageAgent = [];

  for(let i = 0; i < villageMap.length; i++){
    for(let j = 0; j < villageMap[i].length; j++){
      if(villageMap[i][j] === '2'){
        allAgent.push([i, j]);
      }
    }
  }

  function choiceAgent(num, agent, arr){
    if(num === 0){
      villageAgent.push(agent);
      return;
    }

    for(let i = 0; i < arr.length; i++){
      let tempArr = arr.slice();
      tempArr.splice(i, 1);
      choiceAgent(num - 1, agent.concat(arr[i]), tempArr);
    }
  }

  choiceAgent(num, [], allAgent);

  return villageAgent;
};

let village = [
  '0022', // 첫 번째 줄
  '0020',
  '0020',
  '0220',
];
let num = 1;
let output = gossipProtocol2(village, num);
console.log(output); // --> 0 (이미 모든 주민이 정보를 알고 있는 상태)

village = [
  '1001212',
  '1201011',
  '1102001',
  '2111102',
  '0012111',
  '1111101',
  '2121102',
];
num = 5;
output = gossipProtocol2(village, num);
console.log(output); // --> 3 