package ch02.se20;

public class ArrayTest {
  public static void main(String[] args) {
    int[] arr = new int[10];

    // 다른 선언방식
    // int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int total = 0;

    for (int i = 0, num = 1; i < arr.length; i++) {
      arr[i] = num++;
    }

    // 전체를 순회할 때 사용하는 다른 방법
    // int i는 요소이며, 자료형도 같게 해야한다.
    for (int i : arr) {
      total += i;
    }

    System.out.println(total);
  }
}
