package ch03.se11;

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
}
