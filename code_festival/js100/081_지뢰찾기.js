/**
 * ABOUT
 *
 * DATE: 2022-03-24
 * AUTHOR: jortier
 *
 * COMMENT:
 * 
 */

let value ="0 1 0 0 0\n0 0 0 0 0\n0 0 0 1 0\n0 0 1 0 0\n0 0 0 0 0"
let sp = value.split('\n');
let count = 0;

for(let i of sp){
  sp[count] = i.replace('1', 'f').split(' ');
  count += 1;
}

count = 0;

let search = 0;

for(let s of sp){
  for(let i of s){
    if(i === 'f'){
      search = s.indexOf(i);

      if(search > 0){
        s[search - 1] = '*';
      }
      
      if(search < 4){
        s[search + 1] = '*';
      }
  
      if(count > 0){
        sp[count - 1][search] = '*';
      }
  
      if(count < 4){
        sp[count + 1][search] = '*'
      }
    }
  }

  count += 1;
}

for(let i of sp){
  console.log(i);
}