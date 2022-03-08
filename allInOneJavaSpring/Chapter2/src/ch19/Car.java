package ch19;

public class Car {
  private static int count = 10000;
  private int carNumber;

  public Car() {
    count++;
    this.carNumber = count;
  }

  public int getCarNumber() {
    return carNumber;
  }
}
