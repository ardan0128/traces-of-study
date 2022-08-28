function weekly2021085(word){
  var answer = 0;
    
    let count = 0;
    let aeiou = ['A', 'E', 'I', 'O', 'U'];

    function findWord(idx, temp, word){
      if(idx === 5) return;
      for(let i = 0; i < aeiou.length; i += 1){
          let tempWord = temp + aeiou[i];
          count += 1;
          if(tempWord === word){
              answer = count;
          }
          findWord(idx + 1, tempWord, word);
      }
    }
    
    findWord(0, "", word);
    
    return answer;
}



let result = weekly2021085("I");
console.log(result);