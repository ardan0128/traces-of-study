class Stack {
  constructor() {
    this.storage = {};
    this.top = 0; // 스택의 가장 상단을 가리키는 포인터 변수를 초기화 합니다.
  }

  size() {
    return FILL_ME_IN;
  }

	// 스택에 데이터를 추가 할 수 있어야 합니다.
  push(element) {
    this.storage[FILL_ME_IN] = element;
    this.top += 1;
  }
	
	// 가장 나중에 추가된 데이터가 가장 먼저 추출되어야 합니다.
  pop() {
    // 빈 스택에 pop 연산을 적용해도 에러가 발생하지 않아야 합니다
    if (FILL_ME_IN) {
      return;
    }

    const result = this.storage[FILL_ME_IN];
    delete this.storage[FILL_ME_IN];
    this.top -= 1;
    
    return result;
  }
}