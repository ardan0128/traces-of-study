function divideChocolateStick(M, N) {
  // TODO: 여기에 코드를 작성합니다.
  let result1 = [];
  let result2 = []; 

  function gcd(m, n){
    if(m % n === 0){
      return n;
    }

    return gcd(n, m % n);
  }

  let maxNum = gcd(M, N);

  let left = 1;
  let right = maxNum;
  while(left <= right){
    if(left * right === maxNum){
      result1.push([left, (M / left), (N /left)]);
      if(right !== left){
        result2.unshift([right, (M / right), (N / right)]);
      }
    }
    left++;
    right = Math.floor(maxNum / left);
  }

  return [...result1, ...result2];
}