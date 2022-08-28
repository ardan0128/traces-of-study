/**
 * ABOUT
 *
 * DATE: 2022-03-21
 * AUTHOR: jortier
 *
 * COMMENT:
 * 재귀함수를 사용해서 해결할 수 있다.
 * 
 * merge sort는 하나의 리스트를 두 개의 균등한 크기로 분할하고 분할된 부분 리스트를 정렬한 다음,
 * 두 개의 정렬된 부분 리스트를 합하여 전체가 정렬된 리스트가 되게 하는 방법이다.
 */

function mergeSort(arr) {
  if(arr.length <= 1){
    return arr;
  }

  const mid = Math.floor(arr.length / 2);
  const left = arr.slice(0, mid);
  const right = arr.slice(mid);

  return merge(mergeSort(left), mergeSort(right));
}

function merge(left, right) {
  let result = [];

  while(left.length && right.length){
    if(left[0] < right[0]){
      result.push(left.shift());
    }else{
      result.push(right.shift());
    }
  }

  while(left.length){
    result.push(left.shift());
  }

  while(right.length){
    result.push(right.shift());
  }

  return result;
}

const array = prompt('배열을 입력하세요').split(' ').map(n => parseInt(n, 10));

console.log(mergeSort(array));