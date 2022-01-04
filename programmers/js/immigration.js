function solution1(n, times) {
  var answer = 0;
  let tempTimes = times.slice();
  
  for(let i = 0; i < n - times.length; i++){
    let tempValue = tempTimes[0] + times[0];
    let tempTimesIndex = 0;
    for(let j = 0; j < times.length; j++){
      if(tempTimes[j] + times[j] < tempValue){
        tempValue = tempTimes[j] + times[j];
        tempTimesIndex = j;
      }
    }
    tempTimes[tempTimesIndex] = tempValue;
  }

  answer = Math.max(...tempTimes);

  return answer;
}