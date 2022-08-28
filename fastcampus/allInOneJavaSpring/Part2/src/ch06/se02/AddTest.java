package ch06.se02;

public class AddTest {
  public static void main(String[] args) {
    Add addLamda = (x, y) -> {
      return x + y;
    };

    System.out.println(addLamda.add(3, 5));
  }
}
