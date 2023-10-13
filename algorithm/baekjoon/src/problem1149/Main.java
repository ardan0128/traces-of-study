package problem1149;

import java.util.Scanner;

public class Main {
  static int N;
  static int[][] dy;
  static int[] a;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    dy = new int[N + 1][3];
    a = new int[3];

    dy[0][0] = dy[0][1] = dy[0][2] = 0;

    for(int i = 1; i <= N; i++){
      for(int j = 0; j < 3; j++){
        a[j] = scanner.nextInt();
      }

      dy[i][0] = Math.min(dy[i - 1][1], dy[i - 1][2]) + a[0];
      dy[i][1] = Math.min(dy[i - 1][0], dy[i - 1][2]) + a[1];
      dy[i][2] = Math.min(dy[i - 1][0], dy[i - 1][1]) + a[2];
    }

    System.out.println(Math.min(dy[N][0], Math.min(dy[N][1], dy[N][2])));
  }
}
