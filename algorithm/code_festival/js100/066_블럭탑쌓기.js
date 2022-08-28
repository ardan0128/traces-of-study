/**
 * ABOUT
 *
 * DATE: 2022-03-22
 * AUTHOR: jortier
 *
 * COMMENT:
 * 반복문을 이용해서 해당 문자가 규칙에 맞는지 체크를 한다.
 */

function solution(blocks, rule) {
  let answer = [];

  for(let block of blocks){
    answer.push(checkBlock(block, rule));
  }

  return answer;
}

function checkBlock(block, rule){
  let temp = rule.indexOf(rule[0]);

  for (let str of block){
    if (rule.includes(str)){
      if (temp > rule.indexOf(str)){
        return '불가능';
      }

      temp = rule.indexOf(str);
    }
  }
  return '가능';
}

const blocks = ['ABCDEF', 'BCAD', 'ADEFQRX', 'BEDFG', 'AEBFDGCH'];
const rule = 'ABCD';

console.log(solution(blocks, rule));