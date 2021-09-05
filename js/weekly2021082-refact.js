const scores = [
  [100,90,98,88,65],
  [50,45,99,85,77],
  [47,88,95,80,67],
  [61,57,100,80,65],
  [24,90,94,75,65]
]

function weekly2021082(scores){
  var answer = '';
  let i = 0;
  let j = 0;
  let score = {};
  let myScore = 0;

  while(i < scores.length && j < scores.length){
    score[scores[i][j]] = (score[scores[i][j]] || 0) + 1;
    if(i === j){
      myScore = scores[i][j];
    }

    i += 1;

    if(i >= scores.length){
      let maxScore;
      let minScore;
      Object.keys(score).reduce((accu, curr, i) => {
        if(i === 1){
          maxScore = Number(accu);
          minScore = Number(accu);
        }
        if(minScore > Number(curr)){
          minScore = Number(curr);
        }
        if(maxScore < Number(curr)){
          maxScore = Number(curr);
        }
      });

      if(checkScore(myScore, minScore, maxScore, score)){
        deleteScore(myScore, score)
      }

      let sum = sumScore(score);

      let scoreLength = countScore(score);

      let average = sum / scoreLength;

      answer += gradeScore(average);

      score = {};
      i = 0;
      j += 1;
    }
  }

  return answer;
}

console.log(weekly2021082(scores));

function gradeScore(averageScore){
  if(averageScore >= 90) return 'A';
  else if(averageScore < 90 && averageScore >= 80) return 'B';
  else if(averageScore < 80 && averageScore >= 70) return 'C';
  else if(averageScore < 70 && averageScore >= 50) return 'D';
  else if(averageScore < 50) return 'F';
}

function sumScore(score){
  return Object.keys(score).reduce((accu, curr) => {
    return Number(accu) + Number(curr * score[curr]);
  }, 0);
}

function countScore(score){
  return Object.keys(score).reduce((accu, curr) => {
    return Number(accu) + Number(score[curr]);
  }, 0);
}

function deleteScore(myScore, score){
  delete score[myScore];
}

function checkScore(myScore, minScore, maxScore, score){
  return (myScore === minScore || myScore === maxScore) && score[myScore] === 1;
};