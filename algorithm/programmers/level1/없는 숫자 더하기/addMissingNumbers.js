function solution(numbers) {
  var answer = 0;
  let arr = [true, true, true, true, true, true, true, true, true, true];
  
  for(let i = 0; i < numbers.length; i++){
    arr[numbers[i]] = false;
  }
	
  for(let i = 0; i < arr.length; i++){
      if(arr[i]){
    answer += i;
    }
  }
  
  return answer;
}

let result1 = solution([1,2,3,4,6,7,8,0]);
let result2 = solution([5,8,4,0,6,7,9]);
console.log(result1);
console.log(result2);