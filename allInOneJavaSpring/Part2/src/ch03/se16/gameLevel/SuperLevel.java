package ch03.se16.gameLevel;

public class SuperLevel extends PlayerLevel {

  @Override
  public void jump() {
    System.out.println("아주 높이 jump 함");
  }

  @Override
  public void run() {
    System.out.println("아주 빨리 달림");
  }

  @Override
  public void showLevelMessage() {
    System.out.println("===== 고급자 레벨 =====");
  }

  @Override
  public void turn() {
    System.out.println("turn 함");
  }

}
