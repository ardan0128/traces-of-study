package ch08;

public class MinMaxProblem {
  public static void main(String[] args) {
    int[] numbers = { 10, 55, 23, 2, 79, 101, 16, 82, 30, 45 };
    int min = numbers[0];
    int max = numbers[0];
    int minIdx = 0;
    int maxIdx = 0;

    for (int i = 1; i < numbers.length; i++) {
      if (min > numbers[i]) {
        min = numbers[i];
        minIdx = i + 1;
      }

      if (max < numbers[i]) {
        max = numbers[i];
        maxIdx = i + 1;
      }
    }

    System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + maxIdx + "번째 입니다.");
    System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + minIdx + "번째 입니다.");
  }
}
