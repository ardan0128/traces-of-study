package ch03.se09;

/**
 * 추상 클래스는 상속만을 위한 클래스이다.
 */
public abstract class Computer {
  public abstract void display();

  public abstract void typing();

  public void turnOn() {
    System.out.println("전원을 켭니다");
  }

  public void turnOff() {
    System.out.println("전원을 끕니다.");
  }
}
