const getItemFromTwoSortedArrays = function (arr1, arr2, k) {
  // TODO: 여기에 코드를 작성합니다.
  let count = 0, idx1 = 0, idx2 = 0;
  let tempArr1 = [];
  let tempArr2 = [];
  let result = 0;

  // 시작값 설정
  if(arr1[0] > arr2[0]){
    tempArr1 = arr2.slice();
    tempArr2 = arr1.slice();
  }else{
    tempArr1 = arr1.slice();
    tempArr2 = arr2.slice();
  }

  while(count < k){
    if(tempArr1[idx1] <= tempArr2[idx2]){
      result = tempArr1[idx1];
      idx1 += 1;
    }else{
      result = tempArr2[idx2];
      idx2 += 1;
    }
    count++;
  }

  return result;
};

let arr1 = [1, 4, 8, 10];
let arr2 = [2, 3, 5, 9];

let result = getItemFromTwoSortedArrays(arr1, arr2, 6);

console.log(result);

arr1 = [1, 1, 2, 10];
arr2 = [3, 3];
result = getItemFromTwoSortedArrays(arr1, arr2, 4);
console.log(result);

arr1 = [1, 1, 2, 10];
arr2 = [2, 3, 7, 12];
result = getItemFromTwoSortedArrays(arr1, arr2, 7);
console.log(result);