/**
 * ABOUT
 *
 * DATE: 2022-03-21
 * AUTHOR: jortier
 *
 * COMMENT:
 * 해당 숫자를 문자로 하여 1이 포함되어있는지 확인하고 카운트를 증가시키면 해결할 수 있다.
 */

// 방법 1
const obj = {};

for(let i = 0; i <= 1000; i++){
  let temp = i;

  while(temp > 0){
    let num = temp % 10;

    if(obj[num]){
      obj[num]++;
    }else{
      obj[num] = 1;
    }

    temp = parseInt(temp / 10, 10);
  }
}

console.log(obj[1]);

// 방법 2
let s1 = '';

for(let i = 0; i <= 1000; i++){
  s1 += i;
}

console.log(s1);
console.log(s1.match(/1/g).length);

// 방법 3
let s2 = '';

for(let i = 0; i <= 1000; i++){
  s2 += i;
}

let count2 = 0;

for(let j in s2){
  if(s2[j] == 1){
    count2++;
  }
}

console.log(count2);

// 방법 4
let s4 = '';

for(let i = 0; i <= 1000; i++){
  s4 += i;
}

let count4 = 0;

for(let j of s4){
  if(j == 1){
    count4++;
  }
}

console.log(count4);