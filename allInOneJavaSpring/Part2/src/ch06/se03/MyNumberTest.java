package ch06.se03;

public class MyNumberTest {
  public static void main(String[] args) {
    MyNumber myNumber = (a, b) -> a > b ? a : b;

    System.out.println(myNumber.getMax(10, 20));
  }
}
