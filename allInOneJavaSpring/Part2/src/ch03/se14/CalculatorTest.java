package ch03.se14;

public class CalculatorTest {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 2;

    Calc calc = new CompleteCalc();
    System.out.println(calc.add(num1, num2));
    System.out.println(calc.substract(num1, num2));
    System.out.println(calc.times(num1, num2));
    System.out.println(calc.divide(num1, num2));

    calc.description();

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int total = Calc.total(arr); // static 메서드라서 바로 호출하여 사용할 수 있다.
    System.out.println(total);
  }
}
