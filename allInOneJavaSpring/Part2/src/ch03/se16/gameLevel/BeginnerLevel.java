package ch03.se16.gameLevel;

public class BeginnerLevel extends PlayerLevel {

  @Override
  public void jump() {
    System.out.println("jump 못 함");
  }

  @Override
  public void run() {
    System.out.println("천천히 달림");
  }

  @Override
  public void showLevelMessage() {
    System.out.println("===== 초급자 레벨 =====");
  }

  @Override
  public void turn() {
    System.out.println("turn 못 함");
  }

}
