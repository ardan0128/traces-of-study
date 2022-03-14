package ch05.se03;

public class MyListNode {
  private String data;
  public MyListNode next;

  /**
   * 아무 인자 없이 생성되는 node
   */
  public MyListNode() {
    data = null;
    next = null;
  }

  /**
   * data만 인자로 받는 node
   * 
   * @param data
   */
  public MyListNode(String data) {
    this.data = data;
    this.next = null;
  }

  /**
   * data와 다음 node가 있는 node
   * 
   * @param data
   * @param link
   */
  public MyListNode(String data, MyListNode link) {
    this.data = data;
    this.next = link;
  }

  public String getData() {
    return data;
  }
}
