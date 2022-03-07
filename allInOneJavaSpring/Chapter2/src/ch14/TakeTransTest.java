package ch14;

public class TakeTransTest {
  public static void main(String[] args) {
    Student studentJ = new Student("James", 5000);
    Student studentT = new Student("Tomas", 10000);

    Bus bus100 = new Bus(100);
    studentJ.takeBus(bus100);

    Subway greenSubway = new Subway("Green");
    studentT.takeSubway(greenSubway);
    studentT.takeBus(bus100);

    studentJ.showInfo();
    studentT.showInfo();

    bus100.showBusInfo();
    greenSubway.showSubwayInfo();
  }
}
