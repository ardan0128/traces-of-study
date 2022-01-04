function solution(numbers) {
  var answer = 0;
  let numbersArr = [...numbers];
  let numArr = [];
  
  let makeNum = (idx, str) => {
      if(idx === numbersArr.length){
          return;
      }
      
      for(let i = 0; i < numbersArr.length; i += 1){
          console.log(`idx = ${idx}, i = ${i}, str = ${str}, ${str + numbersArr[i]}`);
          
          if(numArr.indexOf(Number(str + numbersArr[i]) === -1)){
              numArr.push(Number(str + numbersArr[i]));
          }
          makeNum(idx + 1, str + numbersArr[i]);
      }
  }
  
  makeNum(0, '');
  
  console.log(numArr);
  
  for(let i = 0; i < numArr.length; i += 1){
      let checkNum = true;
      
      for(let j = 2; j < Math.floor(numArr[i] / 2); j += 1){
          if(numArr[i] % j === 0){
              checkNum = false;
              break;
          }
      }
      
      if(checkNum){
          answer += 1;
      }
  }
  
  return answer;
}