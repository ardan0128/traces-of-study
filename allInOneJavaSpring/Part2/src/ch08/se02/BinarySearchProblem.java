package ch08;

public class BinarySearchProblem {
  public static void main(String[] args) {
    int[] numbers = { 12, 25, 31, 48, 54, 66, 70, 83, 95, 108 };

    findNumber(numbers, 83);
    findNumber(numbers, 88);
  }

  static void findNumber(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length;
    int mid = (left + right) / 2;
    int temp = numbers[mid];
    boolean find = false;

    while (left <= right) {
      if (target == temp) {
        find = true;
        break;
      } else if (target < temp) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }

      mid = (left + right) / 2;
      temp = numbers[mid];
    }

    if (find == true) {
      mid++;
      System.out.println("찾는 수는 " + mid + "번째 있습니다.");
    } else {
      System.out.println("찾을 수 없습니다.");
    }
  }
}
