function fibonacci(n) {
  // TODO: 여기에 코드를 작성합니다.
  let a = 0;
  let b = 1;

  if(n <= 1){
    return n;
  }

  let count = 2;
  const tempFibonacci = (num) => {
    let c = a + b;
    a = b;
    b = c;

    if(count === n){
      return b;
    }
    
    return tempFibonacci(count++);
  }

  let result = tempFibonacci(count);

  return result;
}
