package problem2156;

import java.util.Scanner;

public class Main {
  static int N;
  static int[][] dy;
  static int[] wine;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    dy = new int[N + 1][2];
    wine = new int[N + 1];

    for(int i = 1; i <= N; i++){
      wine[i] = scanner.nextInt();
    }

    dy[1][0] = 0;
    dy[1][1] = wine[1];

    if(N >=2){
      dy[2][0] = wine[2];
      dy[2][1] = wine[1] + wine[2];
    }

    for(int i = 3; i <= N; i++){
      dy[i][0] = Math.max(dy[i - 2][0] + wine[i], dy[i - 2][1] + wine[i]);
      dy[i][0] = Math.max(dy[i][0], Math.max(dy[i - 3][0], dy[i - 3][1] + wine[i]));
      dy[i][1] = dy[i - 1][0] + wine[i];
    }

    System.out.println(Math.max(Math.max(dy[N][0], dy[N][1]), Math.max(dy[N - 1][0], dy[N - 1][1])));
  }
}
