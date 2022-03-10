package ch03.se16.gameLevel;

public class MainBoardPlay {
  public static void main(String[] args) {
    Player player = new Player();
    player.play(1);

    AdvancedLevel aPlayer = new AdvancedLevel();
    player.upgradeLevel(aPlayer);
    player.play(2);

    SuperLevel sPlayer = new SuperLevel();
    player.upgradeLevel(sPlayer);
    player.play(3);
  }
}
