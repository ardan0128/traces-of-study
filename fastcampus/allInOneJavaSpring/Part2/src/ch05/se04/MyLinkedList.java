package ch05.se04;

public class MyLinkedList {
  private MyListNode head;
  int count;

  public MyLinkedList() {
    head = null;
    count = 0;
  }

  public MyListNode addElement(String data) {
    MyListNode newNode; // 추가할 node

    if (head == null) { // 시작 node가 없을 때
      newNode = new MyListNode(data);
      head = newNode;
    } else {
      newNode = new MyListNode(data);

      MyListNode temp = head;

      while (temp.next != null) { // 마지막 요소까지 반복
        temp = temp.next;
      }

      temp.next = newNode; // 마지막 요소에 연결되는 node 할당
    }

    count++;

    return newNode;
  }

  public MyListNode insertElement(int position, String data) {
    int i;
    MyListNode tempNode = head;
    MyListNode newNode = new MyListNode(data);

    if (position < 0 || position > count) {
      System.out.println("추가할 위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
      return null;
    }

    if (position == 0) { // index가 0일 경우
      newNode.next = head;
      head = newNode;
    } else {
      MyListNode preNode = null;

      for (i = 0; i < position; i++) { // 추가할 index까지 반복
        preNode = tempNode;
        tempNode = tempNode.next;
      }

      newNode.next = preNode.next; // 새로운 노드의 다음 노드에 이전 노드 할
      preNode.next = newNode; // 이전 노드의 다음 노드에 새로운 노드 할당
    }

    count++;

    return newNode;
  }

  public MyListNode removeElement(int position) {
    int i;
    MyListNode tempNode = head;

    if (position >= count) {
      System.out.println("삭제할 위치 오류입니다. 현재 리스트의 개수는 " + count + "입니다.");
      return null;
    }

    if (position == 0) { // 0번째 index를 삭제할 때
      head = tempNode.next;
    } else {
      MyListNode preNode = null;

      for (i = 0; i < position; i++) {
        preNode = tempNode;
        tempNode = tempNode.next;
      }

      preNode.next = tempNode.next;
    }

    count--;
    System.out.println(position + "번째 항목 삭제되었습니다.");

    return tempNode;
  }

  public String getElement(int position) {
    int i;
    MyListNode tempNode = head;

    if (position >= count) {
      System.out.println("검색위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");

      return new String("error");
    }

    if (position == 0) {
      return head.getData();
    }

    for (i = 0; i < position; i++) {
      tempNode = tempNode.next;
    }

    return tempNode.getData();
  }

  public MyListNode getNode(int position) {
    int i;
    MyListNode tempNode = head;

    if (position >= count) {
      System.out.println("검색위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");

      return null;
    }

    if (position == 0) {
      return head;
    }

    for (i = 0; i < position; i++) {
      tempNode = tempNode.next;
    }

    return tempNode;
  }

  public void removeAll() {
    head = null;
    count = 0;
  }

  public int getSize() {
    return count;
  }

  public void printAll() {
    if (count == 0) {
      System.out.println("출력할 내용이 없습니다.");
    }

    MyListNode temp = head;

    while (temp != null) {
      System.out.print(temp.getData());

      temp = temp.next;

      if (temp != null) {
        System.out.print(" -> ");
      }
    }

    System.out.println("");
  }

  public boolean isEmpty() {
    if (head == null) {
      return true;
    } else {
      return false;
    }
  }
}
