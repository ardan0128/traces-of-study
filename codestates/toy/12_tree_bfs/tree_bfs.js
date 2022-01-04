let bfs = function (node) {
  // TODO: 여기에 코드를 작성합니다.
  const addValue = (node) => {
    result.push(node.value);
  }

  const addChildValue = (child) => {
    if(child.length === 0){
      return;
    }

    let nextChild = [];
    
    for(let i = 0; i < child.length; i++){
      addValue(child[i]);

      if(child[i].children.length !== 0){
        // nextChild.concat(child[i].children);
        nextChild.push(...child[i].children);
      }
    }

    return addChildValue(nextChild);
  }

  let result = [];

  if(node.value !== undefined){
    addValue(node);

    if(node.children.length !== 0){
      addChildValue(node.children);
    }
  }

  return result;
};

// 이 아래 코드는 변경하지 않아도 됩니다. 자유롭게 참고하세요.
let Node = function (value) {
  this.value = value;
  this.children = [];
};

// 위 Node 객체로 구성되는 트리는 매우 단순한 형태의 트리입니다.
// membership check(중복 확인)를 따로 하지 않습니다.
Node.prototype.addChild = function (child) {
  this.children.push(child);
  return child;
};