let bufferSize = 2;
let capacities = 10;
let documents = [7, 4, 5, 6];

function queuePrinter(bufferSize, capacities, documents) {
  // TODO: 여기에 코드를 작성합니다.
  let sec = 0;
  let donSum = 0;
  let bufferArr = Array(bufferSize).fill(0);
  let documentsArr = documents.slice();

  // document의 합
  let documentSum = 0;
  for(let i = 0; i < documents.length; i++){
    documentSum += documents[i];
  }

  // 완료된 문서의 합과 보낸 문서의 합이 같을 때까지
  while(donSum < documentSum){
    // 무조건 1초씩 증가
    sec++;

    // 1초가 지날때마다 무조건 한칸씩 이동
    bufferArr = bufferArr.slice(1);

    // 1초가 지날때마다 무조건 합을 구한다.
    donSum += Number(bufferArr[0]);

    // 인쇄 작업 목록의 크기 합
    let bufferSum = 0;
    for(let i = 0; i < bufferArr.length; i++){
      bufferSum += bufferArr[i];
    }

    // 인쇄 작업 목록의 합과 capacities 비교
    if(bufferSum + documentsArr[0] < capacities){
      bufferArr.push(documentsArr.slice(0, 1)[0]);
      documentsArr = documentsArr.slice(1);
    }else{
      bufferArr.push(0);
    }
  }

  console.log(sec);

  return sec;
}

queuePrinter(bufferSize, capacities, documents);

queuePrinter(10, 20, [10, 20, 1, 20]);