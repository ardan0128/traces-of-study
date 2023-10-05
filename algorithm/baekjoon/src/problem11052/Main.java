package problem11052;

import java.util.Scanner;

public class Main {
  static int N;
  static int[] P;
  static int[] dy;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    P = new int[N + 1];
    dy = new int[N + 1];

    for(int i = 1; i <= N; i++){
      P[i] = scanner.nextInt();
    }

    dy[0] = 0;

    for(int i = 1; i <= N; i++){
      for(int j = 1; j <= i; j++){
        dy[i] = Math.max(dy[i], dy[i - j] + P[j]);
      }
    }

    System.out.println(dy[N]);
  }
}
