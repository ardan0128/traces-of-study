package problem2193;

import java.util.Scanner;

public class Main {
  static int N;
  static long[][] dy;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    dy = new long[N + 1][2];
    dy[1][1] = 1;

    for(int i = 2; i <= N; i++){
      dy[i][0] = dy[i - 1][0] + dy[i - 1][1];
      dy[i][1] = dy[i - 1][0];
    }

    System.out.println(dy[N][0] + dy[N][1]);
  }
}
