package dynamicProgramming.problem9095;

import java.util.Scanner;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static int[] dp;

  public static void main(String[] args){
    dp = new int[15];
    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 4;

    for(int i = 4; i <= 11; i++){
      dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
    }

    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    for(int i = 1; i <= N; i++){
      int n = scanner.nextInt();

      sb.append(dp[n]).append('\n');
    }

    System.out.println(sb);
  }
}
