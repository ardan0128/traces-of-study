const insertionSort = function (arr, callback) {
  // TODO: 여기에 코드를 작성합니다.
  arrSort(arr, 0);

  return arr;
};

function arrSort(arr, i){
  if(i > arr.length){
    return;
  }
  for(let j = 1; j < arr.length; j += 1){
    if(arr[j - 1] > arr[j]){
      let temp = arr[j - 1]
      arr.splice(j - 1, 1);
      arr.splice(j, 0, temp);
    }
  }

  arrSort(arr, i + 1);
}

console.log(insertionSort([ 1, 2, 43, 21 ]));