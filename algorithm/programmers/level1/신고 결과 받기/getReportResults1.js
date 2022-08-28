function solution(id_list, report, k) {
  var answer = [];
  let result = {};
  let reportCount = {};
  let filterReport = report.filter((a, b) => report.indexOf(a) === b);
  
  for(let i = 0; i < id_list.length; i++){
    result[id_list[i]] = [];
    reportCount[id_list[i]] = 0;
  }
  
  for(let i = 0; i < filterReport.length; i++){
    let arr = filterReport[i].split(' ');
    result[arr[0]].push(arr[1]);
    reportCount[arr[1]]++;
  }
  
  let useStop = [];
  for(let item in reportCount) {
    if(reportCount[item] >= k){
      useStop.push(item);
    }
  }
  
  for(let item in result){
    let count = 0;
    for(let i = 0; i < result[item].length; i++){
      if(useStop.includes(result[item][i]) ){
        count++;
      }
    }
    answer.push(count);
  }
  
  return answer;
}