/**
 * ABOUT
 *
 * DATE: 2022-03-24
 * AUTHOR: jortier
 *
 * COMMENT:
 * 
 */

const graph = {
  1: [2, 3, 4],
  2: [1, 3, 4, 5, 6],
  3: [1, 2, 7],
  4: [1, 2, 5, 6],
  5: [2, 4, 6, 7],
  6: [2, 4, 5, 7],
  7: [3, 5, 7],
};

const user_input = prompt('입력해주세요').split();
const start = parseInt(user_input[0], 10);
const end = parseInt(user_input[1], 10);

let queue = [start];
let visited = [];

function solution() {
  let node = n[n.length - 1];
  let length = 0;

  if(node === end){
    return visited.length;
  }

  if(visited.includes(node)){
    return visited.length;
  }else{
    visited.push(node);
  }

  let max = [];

  for(let next_node in graph[node]){
    n.push(graph[node][next_node]);
    max.push(length, solution(n, visited));

    length = Math.max.apply(null, max);

    queue.pop();
  }

  return length;
}

console.log(solution(queue, visited));
