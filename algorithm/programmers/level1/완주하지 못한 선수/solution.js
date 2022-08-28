/**
 * ABOUT
 *
 * DATE: 2022-03-15
 * AUTHOR: jortier
 *
 * URL: https://programmers.co.kr/learn/courses/30/lessons/42576
 *
 * COMMENT:
 * 매개변수인 participant, completion을 Hash로 만들어서 참가자와 완주자를 비교한다.
 */

function solution(participant, completion) {
  var answer = '';

  let pa = participant.reduce((accu, curr) => { 
    accu[curr] = (accu[curr] || 0) + 1; 

    return accu;
  }, {});

  let co = completion.reduce((accu, curr) => { 
    accu[curr] = (accu[curr] || 0) + 1;

    return accu;
  }, {});
  
  for(let person in pa){
    if(pa[person] !== co[person]){
      answer = person;
      
      break;
    }
  }
  
  return answer;
}