/**
 * ABOUT
 *
 * DATE: 2022-03-22
 * AUTHOR: jortier
 *
 * COMMENT:
 * 기준 시간과 현재 시간을 비교하면 해결할 수 있다.
 */

function solution(busTime, standardTime) {
  let answer = [];
  standardTime = standardTime.split(':').map(n => parseInt(n, 10));
  standardTime = (standardTime[0] * 60) + standardTime[1];

  for(let i in busTime){
    let time = busTime[i].split(':').map(n => parseInt(n, 10));
    time = (time[0] * 60) + time[1];

    if(time < standardTime){
      answer.push('지나갔습니다');
    }else{
      let hour = parseInt((time - standardTime) / 60, 10);
      let minute = (time - standardTime) % 60;
      answer.push(String(hour).padStart(2, 0) + '시간 ' + String(minute).padStart(2, 0) + '분');
    }
  }

  return answer;
}

console.log(solution(['12:30', '13:20', '14:13'], '12:40'));