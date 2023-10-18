package problem1309;

import java.util.Scanner;

public class Main {
  static int N;
  static int[][] dy;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    dy = new int[N + 1][3];
    dy[1][0] = 1;
    dy[1][1] = 1;
    dy[1][2] = 1;

    for(int i = 2; i <= N; i++){
      for(int j = 0; j <= 2; j++){
        dy[i][0] += dy[i - 1][j];
        dy[i][0] %= 9901;

        for(int k = 0; k <= 1; k++){
          if((j & (1 << k)) != 0){
            continue;
          }

          dy[i][1 << k] += dy[i - 1][j];
          dy[i][1 << k] %= 9901;
        }
      }
    }

    System.out.println((dy[N][0] + dy[N][1] + dy[N][2]) % 9901);
  }
}
