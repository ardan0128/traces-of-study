function solution(n, lost, reserve) {
  let Lost = lost.filter(a => !reserve.includes(a)).sort((a, b) => a - b);
  let Reserve = reserve.filter(a => !lost.includes(a)).sort((a, b) => a - b);
  
  return n - Lost.filter(lostStudent => {
    let extra = Reserve.find(reserveStudent => Math.abs(reserveStudent - lostStudent) <= 1);
    if(!extra) return true;
    Reserve = Reserve.filter(reserveStudent => reserveStudent !== extra);
  }).length;
}

let result1 = solution(5, [2, 4], [1, 3, 5]);
let result2 = solution(5, [2, 4], [3]);
let result3 = solution(3, [3], [1]);
console.log(result1);
console.log(result2);
console.log(result3);