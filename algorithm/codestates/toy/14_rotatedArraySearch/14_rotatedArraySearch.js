const rotatedArraySearch = function (rotated, target) {
  // TODO : 여기에 코드를 작성합니다.
  let min = 0;
  let mid = rotated.indexOf(Math.min.apply(null, rotated));
  let max = rotated.length - 1;

  if(rotated[min] < target && target < rotated[mid - 1]){
    findTarget(min, mid - 1);
  }else if(rotated[mid] < target && target < rotated[max]){
    findTarget(mid, max);
  }else{
    return -1;
  }

  function findTarget(minIdx, maxIdx){
    mid = Math.floor((minIdx + maxIdx) / 2);
    if(rotated[minIdx] < target && target < rotated[mid - 1]){
      console.log(1);
      console.log(`mid = ${mid}`);
      console.log(`minIdx = ${minIdx}`);
      console.log(`maxIdx = ${maxIdx}`);
      findTarget(rotated[minIdx], rotated[mid]);
    }else if(rotated[mid] < target && target < rotated[maxIdx]){
      console.log(2);
      console.log(`mid = ${mid}`);
      console.log(`minIdx = ${minIdx}`);
      console.log(`maxIdx = ${maxIdx}`);
      findTarget(rotated[mid], rotated[maxIdx]);
    }
  }

  return mid;
};

rotatedArraySearch([10, 11, 12, 3, 6, 7, 8, 9], 11);