const binarySearch = function (arr, target) {
  // TODO : 여기에 코드를 작성합니다.
  let minIndex = 0;
  let maxIndex = arr.length - 1;

  let count = 0;

  while(minIndex < maxIndex){
    let mid = Math.floor((minIndex + maxIndex) / 2);

    console.log(minIndex);
    console.log(maxIndex);

    if(target >= arr[mid] && target <= arr[maxIndex]){
      minIndex = mid + 1;
    }
    if(target <= arr[mid] && target >= arr[minIndex]){
      maxIndex = mid - 1;
    }

    count++;
  }

  if(arr[maxIndex] !== target){
    return -1;
  }

  return maxIndex;
};

console.log(binarySearch([4, 6, 8, 9, 10, 15], 9));