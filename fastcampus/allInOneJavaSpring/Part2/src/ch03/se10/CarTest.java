package ch03.se10;

public class CarTest {
  public static void main(String[] args) {
    Car aiCar = new AiCar();
    aiCar.run();

    System.out.println("===== 구분선 =====");

    Car manualCar = new ManualCar();
    manualCar.run();
  }
}
