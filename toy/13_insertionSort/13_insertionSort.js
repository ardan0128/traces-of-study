const insertionSort = function (arr, callback) {
  // TODO: 여기에 코드를 작성합니다.
  arrSort(arr, 0, callback);

  return arr;
};

function arrSort(arr, i, callback){
  if(i > arr.length){
    return;
  }
  for(let j = 1; j < arr.length; j += 1){
    if(callback === undefined){
      if(arr[j - 1] > arr[j]){
        let temp = arr[j - 1]
        arr.splice(j - 1, 1);
        arr.splice(j, 0, temp);
      }
    }else{
      if(callback(arr[j - 1]) > callback(arr[j])){
        let temp = arr[j - 1]
        arr.splice(j - 1, 1);
        arr.splice(j, 0, temp);
      }
    } 
  }

  arrSort(arr, i + 1, callback);
}

console.log(insertionSort([ -11, -10, 2, 29 ], callback = item => item * item));