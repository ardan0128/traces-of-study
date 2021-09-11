function queuePrinter(bufferSize, capacities, documents) {
  // TODO: 여기에 코드를 작성합니다.
  let sec = 0;
  let bufferArr = Array(bufferSize).fill(0);
  let documentSum = documents.reduce((prev, curr) => prev + curr);
  let printSum = 0;

  while(printSum < documentSum){
    sec += 1;
    printSum += bufferArr.shift();

    let bufferSum = bufferArr.reduce((prev, curr) => prev + curr, 0);

    if(bufferSum + documents[0] <= capacities){
      bufferArr.push(documents.shift());
    }else{
      bufferArr.push(0);
    }
  }

  return sec;
}