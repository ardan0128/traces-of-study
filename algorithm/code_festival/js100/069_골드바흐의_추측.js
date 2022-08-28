/**
 * ABOUT
 *
 * DATE: 2022-03-22
 * AUTHOR: jortier
 *
 * COMMENT:
 * 골드바흐의 추측은 오래전부터 알려진 정수론의 미해결 문재로,
 * 2보다 큰 모든 짝수는 두 개의 소수의 합으로 표시할 수 있다는 것이다.
 * 이때 하나의 소수를 두번 사용하는 것은 허용한다.
 */

let prime = [];
let isPrime = true;

for(let i = 2; i < 100; i++){
  for(let j = 2; j < i; j++){
    if(i % j === 0){
      isPrime = false;
    }
  }

  if(isPrime){
    prime.push(i);
  }

  isPrime = true;
}

let val = 56;

let arr = [];

for(let n of prime){
  if(prime.includes(val - n) && n <= (val - n)){
    arr.push([n, val - n]);
  }
}

let a = arr.map(e => e[1] - e[0]);
let minValue = arr[a.indexOf(Math.min.apply(null, a))];
let maxValue = arr[a.indexOf(Math.max.apply(null, a))];

console.log(arr);
console.log(minValue);
console.log(maxValue);
