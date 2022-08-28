package ch06.se01;

class Outer {
  /**
   * 멤버 변수는 생성자에서 생성하는게 좋은 방식이다.
   */
  int outNum = 100;
  static int sNum = 200;

  /**
   * 클래스를 스레드화할 때, 필요한 인터페이스이다.
   */
  Runnable getRunnable(int i) {
    int num = 10;

    return new Runnable() {
      int localNum = 1000;

      @Override
      public void run() {
        // 값을 할당할때 오류가 발생한다.
        // 변수 i, num이 컴파일을 하면서 상수화 되기 때문이다.
        // i = 50;
        // num = 20;

        System.out.println("i = " + i);
        System.out.println("num = " + num);
        System.out.println("localNum = " + localNum);
        System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
        System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
      }
    };
  }

  Runnable runnable = new Runnable() {

    @Override
    public void run() {
      System.out.println("Runnable class");
    }
  };
}

public class AnonumousInnerTest {
  public static void main(String[] args) {
    Outer out = new Outer();
    Runnable runner = out.getRunnable(100);

    runner.run();

    out.runnable.run();
  }
}
