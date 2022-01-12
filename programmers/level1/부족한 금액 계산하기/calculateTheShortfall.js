function solution(price, money, count) {
  var answer = -1;
  let ticket = 0;
  for(let i = 0; i <= count; i++){
    ticket += price * i;
  }
  
  if(ticket < money) return 0;
  
  answer = ticket - money;

  return answer;
}

let result1 = solution(3, 20, 4);
console.log(result1);