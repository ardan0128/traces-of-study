package problem2688;

import java.util.Scanner;

public class Main {
  static int N;
  static long[][] dy;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    dy = new long[65][10];

    for(int i = 0; i <= 9; i++){
      dy[1][i] = 1;
    }

    for(int i = 2; i <= 64; i++){
      for(int j = 0; j <= 9; j++){
        for(int k = 0; k <= j; k++){
          dy[i][j] += dy[i - 1][k];
        }
      }
    }

    int T = scanner.nextInt();

    for(int i = 1; i <= T; i++){
      int N = scanner.nextInt();
      long result = 0;

      for(int j = 0; j <= 9; j++){
        result += dy[N][j];
      }

      System.out.println(result);
    }
  }
}
