/**
 * ABOUT
 *
 * DATE: 2022-03-20
 * AUTHOR: jortier
 *
 * COMMENT:
 * 소수는 1과 자기 자신만으로 나누어 떨어지는 1보다 큰 양의 정수다.
 */

function checkPrime(num){
  for(let i = 2; i < num; i++){
    if(num % i === 0){
      console.log('NO');
      break;
    }

    if(num === 1){
      console.log('NO');
      break;
    }

    console.log('YES');
  }
}

checkPrime(23);
