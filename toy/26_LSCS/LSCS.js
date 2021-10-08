const LSCS = function (arr) {
  //TODO: 여기에 코드를 작성합니다.
  let result = Math.min(...arr);
  let arrSum = 0;
  
  for(let i = 0; i < arr.length; i++){
    arrSum = arrSum + arr[i];
    if (arrSum > result) result = arrSum;

    if (arrSum < 0) {
      arrSum = 0;
    }
  }

  return result;
};

let output = LSCS([1, 2, 3]);
console.log(output); // --> 6

output = LSCS([1, 2, 3, -4]);
console.log(output); // --> 6 ([1, 2, 3])

LSCS([1, 2, 3, -4, 5]);
console.log(output); // --> 7 ([1, 2, 3, -4, 5])

LSCS([10, -11, 11]);
console.log(output); // --> 11 ([11])