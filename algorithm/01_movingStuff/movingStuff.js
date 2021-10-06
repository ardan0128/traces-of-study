function movingStuff(stuff, limit) {
  // TODO: 여기에 코드를 작성합니다.
  let stuffSort = stuff.sort((a, b) => a - b);
  let box = [];
  let left = 0;
  let right = stuffSort.length - 1;

  while(left <= right){
    let boxItem = [];

    if(stuffSort[left] + stuffSort[right] <= limit){
      boxItem.push(stuffSort[left]);
      boxItem.push(stuffSort[right]);
      box.push(boxItem);
      left++;
      right--;
    }else{
      boxItem.push(stuffSort[right]);
      box.push(boxItem);
      right--;
    }
  }

  return box.length;
}

let output = movingStuff([60, 73, 80, 87, 103, 109, 119, 123, 128, 129, 136, 146, 153, 168, 182], 200);
console.log(output); // 11