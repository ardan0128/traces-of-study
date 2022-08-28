function newChickenRecipe(stuffArr, choiceNum) {
  // TODO: 여기에 코드를 작성하세요.
  let result = [];
  let useItem = [];

  for(let i = 0; i < stuffArr.length; i++){
    const temp = String(stuffArr[i]).split('').filter((e) => e === '0');
    if (temp.length <= 2) {
      useItem.push(stuffArr[i]);
    }
  }

  if(useItem.length === 0 || useItem.length < choiceNum){
    return result;
  }

  function makeRecipe(num, item, arr){
    if(num === 0){
      result.push(item);
      return;
    }

    for(let i = 0; i < arr.length; i++){
      let tempArr = arr.slice();
      tempArr.splice(i, 1);
      makeRecipe(num - 1, item.concat(arr[i]), tempArr);
    }
  }

  makeRecipe(choiceNum, [], useItem);

  return result;
}
