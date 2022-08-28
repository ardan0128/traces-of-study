function paveBox(boxes) {
  // TODO: 여기에 코드를 작성합니다.
  let count = 1;
  let result = 1;

  boxes.reduce((prev, curr) => {
    if(prev >= curr){
      count += 1;
      result = count;
      return prev;
    }else{
      result = count;
      count = 1;
      return curr;
    }
  });

  return result;
}