package ch02.se19;

public class CarFactory {
  private static CarFactory instCarFactory = new CarFactory();

  private CarFactory() {
  }

  public static CarFactory getInstCarFactory() {
    if (instCarFactory == null) {
      instCarFactory = new CarFactory();
    }

    return instCarFactory;
  }

  public Car createCar() {
    Car car = new Car();
    return car;
  }
}
