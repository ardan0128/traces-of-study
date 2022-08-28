/**
 * ABOUT
 *
 * DATE: 2022-03-19
 * AUTHOR: jortier
 *
 * COMMENT:
 * 
 */

function gugudan(num){
  let arr = [];

  for(let i = 1; i <= 9; i++){
    arr.push(num * i);
  }

  console.log(arr.join(' '));
}

