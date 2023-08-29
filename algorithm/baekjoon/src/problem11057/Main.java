package problem11057;

import java.util.Scanner;

public class Main {
  static int N;
  static int[][] dy;
  static int[] a;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    a = new int[N + 1];
    dy = new int[N + 1][10];

    for(int i = 0; i <= 9; i++){
      dy[1][i] = 1;
    }

    for(int i = 2; i <= N; i++){
      for(int j = 0; j <= 9; j++){
        for(int k = 0; k <= j; k++){
          dy[i][j] += dy[i - 1][k];
          dy[i][j] %= 10007;
        }
      }
    }

    int result = 0;
    for(int i = 0; i <= 9; i++){
      result += dy[N][i];
      result %= 10007;
    }

    System.out.println(result);
  }
}
