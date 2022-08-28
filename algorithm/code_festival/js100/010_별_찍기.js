/**
 * ABOUT
 *
 * DATE: 2022-03-17
 * AUTHOR: jortier
 *
 * COMMENT:
 * 생각보다 for 문이 많이 사용됐다.
 */

let a = 5;
let tree = '';

for(let i = 1; i <= a; i++){
  let star = '';

  // 별 앞에 빈칸 채우기
  for(let j = 1; j <= a - i; j++){
    star += ' ';
  }

  // 별 채우기
  for(let k = 1; k <= 2 * i - 1; k++){
    star += '*';
  }

  tree += star + '\n';
}

console.log(tree);