/**
 * ABOUT
 *
 * DATE: 2022-03-16
 * AUTHOR: jortier
 *
 * URL: https://programmers.co.kr/learn/courses/30/lessons/42576
 *
 * COMMENT:
 * 마지막에 많이 맞춘 사람 뽑아오는게 까다로웠다.
 */

function solution(answers) {
  var answer = [];
  
  let scores = [0, 0, 0];
  let person1 = [1, 2, 3, 4, 5];
  let person2 = [2, 1, 2, 3, 2, 4, 2, 5];
  let person3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
  
  for(let i = 0; i < answers.length; i++){
    if(answers[i] === person1[i % person1.length]){
      scores[0] += 1;
    }
    
    if(answers[i] === person2[i % person2.length]){
      scores[1] += 1;
    }
    
    if(answers[i] === person3[i % person3.length]){
      scores[2] += 1;
    }
  }
  
  let scoreMax = Math.max(...scores);
  
  for(let i = 0; i < scores.length; i++){
    if(scores[i] === scoreMax){
      answer.push(i + 1);
    }
  }
  
  return answer.sort();
}