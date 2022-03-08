package ch19;

public class CarFactoryTest {
  public static void main(String[] args) {
    CarFactory factory = CarFactory.getInstCarFactory();
    Car mySonata = factory.createCar();
    Car yourSonata = factory.createCar();

    System.out.println(mySonata.getCarNumber());
    System.out.println(yourSonata.getCarNumber());
  }
}
