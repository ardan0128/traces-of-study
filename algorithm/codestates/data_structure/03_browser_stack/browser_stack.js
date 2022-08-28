function browserStack(actions, start) {
  // TODO: 여기에 코드를 작성합니다.
  let prev = [];
  let next = [];

  actions.map(action => {
    if(action === -1 && prev.length !== 0){
      // 뒤로 가기
      next.push(start);
      start = prev.pop();
    }else if(action === 1 && next.length !== 0){
      // 앞으로 가기
      prev.push(start);
      start = next.pop();
    }else{
      // 새로운 페이지
      prev.push(start);
      start = action;
      next = [];
    }
  });

  return [prev, start, next]
}