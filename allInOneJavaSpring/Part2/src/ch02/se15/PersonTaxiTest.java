package ch02.se15;

public class PersonTaxiTest {
  public static void main(String[] args) {
    Person personEdward = new Person("Edward", 20000);
    Taxi taxiGood = new Taxi("잘나간다 운수");

    personEdward.takeTaxi(taxiGood, 10000);
    personEdward.showInfo();
    taxiGood.showInfo();
  }
}
