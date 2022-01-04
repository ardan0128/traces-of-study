function partTimeJob(k) {
  // TODO: 여기에 코드를 작성하세요.
  let coin = [500, 100, 50, 10, 5, 1];
  let totalCoin = 0;

  function changeCoin(index){
    if(index === coin.length){
      return;
    }

    totalCoin += Math.floor(k / coin[index]);
    k = k % coin[index];
    changeCoin(index + 1);
  }

  changeCoin(0);

  return totalCoin;
}
