function test1() {
  // TODO: 여기에 코드를 작성하세요.
  let arr = [0, 1, 1];
  let count = 0;

  return function(){
    let tempCount = count;
    count++;

    if(arr[tempCount] !== undefined){
      return arr[tempCount];
    }

    let item = arr[tempCount - 2] + arr[tempCount - 1];
    arr.push(item);
    return item;
  }
}

const fn = test1();
console.log(fn()); // --> 0
console.log(fn()); // --> 1
console.log(fn()); // --> 1
console.log(fn()); // --> 2
console.log(fn()); // --> 3
console.log(fn()); // --> 5