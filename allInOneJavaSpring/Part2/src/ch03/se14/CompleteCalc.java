package ch03.se14;

public class CompleteCalc extends Calculator {

  @Override
  public int times(int a, int b) {
    return a * b;
  }

  @Override
  public int divide(int a, int b) {
    if (b == 0) {
      return ERROR;
    }
    return a / b;
  }

  public void showInfo() {
    System.out.println("모두 구현했다.");
  }

  @Override
  public void description() {
    System.out.println("CompleteCalc의 사칙연산");
  }

}
