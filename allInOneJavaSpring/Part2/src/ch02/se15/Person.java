package ch02.se15;

public class Person {
  private String name;
  private int money;

  public Person(String name, int money) {
    this.name = name;
    this.money = money;
  }

  public void takeTaxi(Taxi taxi, int cost) {
    this.money -= cost;
    taxi.take(cost);
  }

  public void showInfo() {
    System.out.println(name + " 님의 남은 돈은 " + money + " 원 입니다.");
  }
}
