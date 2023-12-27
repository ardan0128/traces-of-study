package dynamicProgramming.problem11066;

import java.util.Scanner;

public class Main {
  static int T, K;
  static int[] page;
  static int[][] dy, sum;
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    T = scanner.nextInt();

    for(int i = 1; i <= T; i++){
      K = scanner.nextInt();
      page = new int[K + 1];
      sum = new int[K + 1][K + 1];

      for(int j = 1; j <= K; j++){
        page[j] = scanner.nextInt();
      }

      for(int j = 1; j <= K; j++){
        for(int k = j; k <= K; k++){
          sum[j][k] = sum[j][k - 1] + page[k];
        }
      }

      dy = new int[K + 1][K + 1];

      for(int j = 2; j <= K; j++){
        for(int k = 1; k <= K -j + 1; k++){
          int l = k + j - 1;
          dy[k][l] = Integer.MAX_VALUE;

          for(int m = k; m < l; m++){
            dy[k][l] = Math.min(dy[k][l], dy[k][m] + dy[m + 1][l] + sum[k][l]);
          }
        }
      }

      System.out.println(dy[1][K]);
    }
  }
}
