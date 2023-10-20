package problem1562;

import java.util.Scanner;

public class Main {
  static int N;
  static int[][][][] dy;
  static final int div = 1000000000;

  public static void main(String[] main){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    dy = new int[N + 1][10][10][10];

    for(int i = 1; i <= 9; i++){
      dy[1][i][i][i] = 1;
    }

    for(int i = 2; i <= N; i++){
      for(int j = 0; j <= 9; j++){
        for(int k = 0; k <= 9; k++){
          for(int l = 0; l <= 9; l++){
            for(int now : new int[]{j - 1, j + 1}){
              if(now < 0 || now > 9){
                continue;
              }

              dy[i][now][Math.min(k, now)][Math.max(l, now)] += dy[i - 1][j][k][l];
              dy[i][now][Math.min(k, now)][Math.max(l, now)] %= div;
            }
          }
        }
      }
    }

    int result = 0;

    for(int i = 0; i <= 9; i++){
      result += dy[N][i][0][9];
      result %= div;
    }

    System.out.println(result);
  }
}
