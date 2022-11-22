const bubbleSort = function (arr) {
  // TODO: 여기에 코드를 작성합니다.
  let bubbleArr = arr.slice();

  for (let i = 1; i < bubbleArr.length; i++) {
    if (bubbleArr[i - 1] > bubbleArr[i]) {
      let bubble = bubbleArr.splice(i - 1, 1)[0];
      bubbleArr.splice(i, 0, bubble);
      i = 0;
    }
  }

  return bubbleArr;
};
