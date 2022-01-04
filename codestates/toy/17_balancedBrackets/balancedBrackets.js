const balancedBrackets = function (str) {
  // TODO: 여기에 코드를 작성합니다.
  let open = [];

  if(str[0] === ')' || str[0] === '}' || str[0] === ']'){
    return false;
  }

  for(let i = 0; i < str.length; i += 1){
    if(str[i] === '('){
      open.push('(')
    }else if(str[i] === '{'){
      open.push('{')
    }else if(str[i] === '['){
      open.push('[')
    }

    if(str[i] === ')' && open[open.length -1] === '('){
      open.pop();
    }else if(str[i] === '}' && open[open.length -1] === '{'){
      open.pop();
    }else if(str[i] === ']' && open[open.length -1] === '['){
      open.pop();
    }
  }

  // str.map(bracket => {
  //   if(bracket === '('){
  //     open.push('(')
  //   }else if(bracket === '{'){
  //     open.push('{')
  //   }else if(bracket === '['){
  //     open.push('[')
  //   }

  //   if(bracket === ')' && open[open.length -1] === '('){
  //     open.pop();
  //   }else if(bracket === '}' && open[open.length -1] === '{'){
  //     open.pop();
  //   }else if(bracket === ']' && open[open.length -1] === '['){
  //     open.pop();
  //   }
  // });

  if(open.length === 0){
    return true;
  }

  return false;
};
