const binarySearch = function (arr, target) {
  // TODO : 여기에 코드를 작성합니다.
  let minIndex = 0;
  let maxIndex = arr.length - 1;

  while(minIndex <= maxIndex){
    let mid = Math.floor((minIndex + maxIndex) / 2);

    if(target >= arr[mid]){
      minIndex = mid + 1;
    }else {
      maxIndex = mid - 1;
    }
  }

  if(arr[maxIndex] !== target){
    return -1;
  }

  return maxIndex;
};