package ch06.se05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStreamTest {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    for (int i : arr) {
      System.out.println(i);
    }

    System.out.println("=========");

    Arrays.stream(arr).forEach(i -> System.out.println(i));

    System.out.println("=========");

    IntStream intStream = Arrays.stream(arr);
    intStream.forEach(i -> System.out.println(i));

    // stream이 소모가 되어서 다시 사용할 수 없다.
    // int sum = intStream.sum();

    IntStream sumStream = Arrays.stream(arr);

    System.out.println(sumStream.sum());
  }
}
