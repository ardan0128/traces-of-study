package twoPointer.problem2559;

import java.util.Scanner;

public class Main {
  static int N, K;
  static int[] nums;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    nums = new int[N + 1];
    K = scanner.nextInt();

    for(int i = 1; i <= N; i++){
      nums[i] = scanner.nextInt();
    }

    int max = Integer.MIN_VALUE;

    for(int i = K; i <= N; i++){
      int sum = 0;

      for(int j = i - K + 1; j <= i; j++){
        sum += nums[j];
      }

      max = Math.max(max, sum);
    }

    System.out.println(max);
  }
}
