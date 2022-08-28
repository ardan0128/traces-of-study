/**
 * ABOUT
 *
 * DATE: 2022-03-19
 * AUTHOR: jortier
 *
 * COMMENT:
 * 배열을 정렬하여 큰 수 세 개를 찾아 개수를 세었다.
 */

function findScore(str){
  let arr = str.split(' ').sort((a, b) => b - a);
  let top = [];
  let count = 0;
  
  for(let i = 0; i < arr.length; i++){
    if(!top.includes(arr[i]) && top.length < 3){
      top.push(arr[i]);
    }

    if(top.includes(arr[i])){
      count++;
    }
  }

  console.log(count);
}

findScore('97 86 75 66 55 97 85 97 97 95');
