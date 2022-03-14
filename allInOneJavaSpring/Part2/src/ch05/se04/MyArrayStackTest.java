package ch05.se04;

public class MyArrayStackTest {
  public static void main(String[] args) {
    MyArrayStack stack = new MyArrayStack(5);

    stack.push(10);
    stack.push(11);
    stack.push(12);
    stack.push(13);
    stack.push(14);
    stack.push(15);

    stack.printAll();

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pick());
  }
}
