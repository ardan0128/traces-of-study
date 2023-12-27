package dynamicProgramming.problem11726;

import java.util.Scanner;

public class Main {
  static int N;
  static int[] dp;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();

    dp = new int[1005];
    dp[1] = 1;
    dp[2] = 2;

    for(int i = 3; i <= N; i++){
      dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
    }

    System.out.println(dp[N]);
  }
}
