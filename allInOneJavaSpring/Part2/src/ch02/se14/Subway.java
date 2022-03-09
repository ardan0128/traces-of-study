package ch02.se14;

public class Subway {
  String lineColor;
  int passengerCount;
  int money;

  public Subway(String lineColor) {
    this.lineColor = lineColor;
  }

  public void take(int money) {
    this.money += money;
    this.passengerCount++;
  }

  public void showSubwayInfo() {
    System.out.println(lineColor + " 지하철 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
  }
}
