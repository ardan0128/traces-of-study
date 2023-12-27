package dynamicProgramming.problem1003;

import java.util.Scanner;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static int T;
  static long[][] dy;

  public static void main(String[] agrs){
    Scanner scanner = new Scanner(System.in);
    T = scanner.nextInt();
    dy = new long[40 + 1][2];
    dy[0][0] = 1;
    dy[1][1] = 1;

    for(int i = 2; i <= 40; i++){
      dy[i][0] = dy[i - 2][0] + dy[i - 1][0];
      dy[i][1] = dy[i - 2][1] + dy[i - 1][1];
    }

    for(int i = 1; i <= T; i++){
      int t = scanner.nextInt();
      sb.append(dy[t][0]).append(" ").append(dy[t][1]).append("\n");
    }

    System.out.println(sb);
  }
}
