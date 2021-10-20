const LIS = function (arr) {
  //TODO: 여기에 코드를 작성합니다.
  let allArr = [];

  function makeArr(idx, item){
    if(arr.length === idx){
      return;
    }

    for(let i = idx; i < arr.length; i++){
      allArr.push(item.concat(arr[i]));
      makeArr(i + 1, item.concat(arr[i]));
    }
  }

  makeArr(0, []);

  return allArr;
};

let output = LIS([3, 10, 2, 1, 20]);
console.log(output);