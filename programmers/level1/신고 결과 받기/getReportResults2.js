function solution(id_list, report, k) {
  const answer = new Array(id_list.length).fill(0);
  const reportList = {};
  
  id_list.map(user => {
    reportList[user] = [];
  });
  
  report.map(user => {
    const [user_id, report_id] = user.split(' ');
    reportList[report_id].push(user_id);
  });
  
  for(const key in reportList){
    if(reportList[key].length >= k){
      reportList[key].map(user => {
        answer[id_list.indexOf(user)] += 1;
      });
    }
  }
  
  return answer;
}

let result1 = solution(["muzi", "frodo", "apeach", "neo"], ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"], 2);
let result2 = solution(["con", "ryan"], ["ryan con", "ryan con", "ryan con", "ryan con"], 3);

console.log(result1);
console.log(result2);