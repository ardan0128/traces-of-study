package ch03.se14;

public interface Calc {
  double PI = 3.14;
  int ERROR = -999999999;

  int add(int a, int b);

  int substract(int a, int b);

  int times(int a, int b);

  int divide(int a, int b);

  default void description() {
    System.out.println("정수의 사칙연산을 제공한다.");

    // myMethod();
  }

  static int total(int[] arr) {
    int total = 0;

    for (int num : arr) {
      total += num;
    }

    // myStaticMethod();

    return total;
  }

  // Java 9 이후 버전에서 사용가능(현재 Java 8로 수강 중)
  // private void myMethod(){
  // System.out.println("myMethod");
  // }

  // private static void myStaticMethod(){
  // System.out.println("myStaticMethod");
  // }
}
