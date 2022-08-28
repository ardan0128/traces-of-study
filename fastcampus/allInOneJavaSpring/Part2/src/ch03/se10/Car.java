package ch03.se10;

public abstract class Car {
  public abstract void drive();

  public abstract void stop();

  public void engineStart() {
    System.out.println("Engine Start");
  }

  public void engineStop() {
    System.out.println("Engine Stop");
  }

  /**
   * 구현 메서드라서 필요에 따라 재정의해서 사용한다.
   */
  public void wash() {

  }

  /**
   * 시나리오 메서드
   * 템플릿 메서드
   */
  final public void run() {
    engineStart();
    drive();
    stop();
    engineStop();
    wash();
  }
}
