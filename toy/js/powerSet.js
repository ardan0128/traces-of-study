const powerSet = function (str) {
  // TODO: 여기에 코드를 작성합니다.

  // str의 중복을 지우고 알파벳 순으로 정렬을 한다.
  let setStr = [...new Set(str)].sort();
  console.log(setStr);
  let result = [''];

  // for(let i = 0; i < setStr.length; i++){
  //   result.push(setStr[i]);
  //   for(let j = i + 1; j < setStr.length; j++){
  //     result.push(setStr[i] + setStr[j]);
  //     for(let k = j + 1; k < setStr.length; k++){
  //       result.push(setStr[i] + setStr[j] + setStr[k]);
  //       for(let l = k + 1; l < setStr.length; l++){
  //         result.push(setStr[i] + setStr[j] + setStr[k] + setStr[l]);
  //       }
  //     }
  //   }
  // }

  function makeStr(idx, str, arr){
    console.log(str);
    if(idx === arr.length){
      return;
    }
    
    for(let i = idx; i < arr.length; i++){
      result.push(str + arr[i]);
      makeStr(i + 1, str + arr[i], arr);
    }
  }

  makeStr(0, '', setStr);

  return result;
};

console.log(powerSet('jjump'));