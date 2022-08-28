function solution(id_list, report, k) {
  var answer = [];
  answer = new Array(id_list.length).fill(0);
  let result = {};
  
  for(let i = 0; i < id_list.length; i++){
    result[id_list[i]] = [];
  }
  
  for(let item of report){
    let [userId, reportId] = item.split(' ');
    if(!result[reportId].includes(userId)){
      result[reportId].push(userId);
    }
  }
  
  for(const key in result){
    if(result[key].length >= k){
      for(let i = 0; i < result[key].length; i++){
        answer[id_list.indexOf(result[key][i])]++;
      }
    }
  }
  
  return answer;
}

let result1 = solution(["muzi", "frodo", "apeach", "neo"], ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"], 2);
let result2 = solution(["con", "ryan"], ["ryan con", "ryan con", "ryan con", "ryan con"], 3);

console.log(result1);
console.log(result2);