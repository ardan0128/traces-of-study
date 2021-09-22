function orderOfPresentation (N, K) {
  // TODO: 여기에 코드를 작성합니다.
  const factorial = (n) => {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
  };

  let count = 0;
  const isUsed = Array(N + 1).fill(false);

  for (let i = 0; i < K.length; i++) {
    const num = K[i];
    isUsed[num] = true;
    const candidates = isUsed.slice(1, num);
    const validCnt = candidates.filter((el) => el === false).length;
    const formerCnt = validCnt * factorial(N - i - 1);
    count = count + formerCnt;
  }

  return count;
}

