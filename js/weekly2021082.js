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

      if((myScore === minScore || myScore === maxScore) && score[myScore] === 1){
        delete score[myScore];
      }

      let sum = Object.keys(score).reduce((accu, curr) => {
        return Number(accu) + Number(curr * score[curr]);
      }, 0);

      let scoreLength = Object.keys(score).reduce((accu, curr) => {
        return Number(accu) + Number(score[curr]);
      }, 0);

      let average = sum / scoreLength;

      if(average >= 90) answer += 'A';
      else if(average < 90 && average >= 80) answer += 'B';
      else if(average < 80 && average >= 70) answer += 'C';
      else if(average < 70 && average >= 50) answer += 'D';
      else if(average < 50) answer += 'F';

      score = {};
      i = 0;
      j += 1;
    }
  }

  return answer;
}

console.log(weekly2021082(scores));