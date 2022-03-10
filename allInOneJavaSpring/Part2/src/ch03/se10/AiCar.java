package ch03.se10;

public class AiCar extends Car {

  @Override
  public void drive() {
    System.out.println("자율 주행을 한다.");
    System.out.println("자동차가 스스로 방향을 바꾼다.");
  }

  @Override
  public void stop() {
    System.out.println("자동차가 스스로 멈춘다.");
  }

  @Override
  public void wash() {
    System.out.println("자동 세차를 한다.");
  }

}
