/**
 * ABOUT
 *
 * DATE: 2022-03-19
 * AUTHOR: jortier
 *
 * COMMENT:
 * 무게를 더하면서 그 무게가 제한 무게를 넘는지 인원제한이 안넘는지 확인한다.
 */

function play(weight, n, arrWeight){
  let total = 0;
  let count = 0;

  for(let i = 0; i < arrWeight.length; i++){
    total += arrWeight[i];

    if(total > weight || count === n){
      break;
    }

    count++;
  }

  console.log(count);
}

play(50, 5, [20, 20, 20, 20, 20]);

