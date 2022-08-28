function power(base, exponent) {
  // todo: 여기에 코드를 작성합니다.
  if(exponent === 1) return base;
  if(exponent % 2 === 0){
    let num = power(base, exponent / 2)
    return num * num % 94906249;
  }else{
    return base * power(base, exponent - 1) % 94906249;
  }
}
