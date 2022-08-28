let bufferSize = 78;
let capacities = 100;
let documents = [30, 32, 40, 15, 22, 50, 60, 32, 49, 19, 28, 46, 77, 71, 46, 34, 27];

function queuePrinter(bufferSize, capacities, documents) {
  // TODO: 여기에 코드를 작성합니다.
  let sec = 0;
  let bufferArr = Array(bufferSize).fill(0);
  let documentArr = documents.slice();

  // 출력할 문서의 합
  let documentSum = 0;
  for(let i = 0; i < documentArr.length; i++){
    documentSum += documentArr[i];
  }

  // 출력된 문서의 합
  let passSum = 0;

  while(passSum < documentSum){
    // 무조건 일어나는 일
    sec++;
    passSum += bufferArr.slice(0, 1)[0];
    bufferArr = bufferArr.slice(1);
    
    let bufferSum = 0;
    for(let i = 0; i < bufferArr.length; i++){
      bufferSum += bufferArr[i];
    }

    console.log(`bufferSum = ${bufferSum}`);

    if(bufferSum + documentArr[0] <= capacities){
      bufferArr.push(documentArr[0]);
      documentArr = documentArr.slice(1);
    }else{
      bufferArr.push(0);
    }
  }

  console.log(sec);

  return sec;
}

// queuePrinter(bufferSize, capacities, documents);

queuePrinter(10, 20, [10, 20, 1, 20]);