package problem9465;

import java.util.Scanner;

public class Main {
  static int n;
  static int[][] arr;
  static int[][] dy;


  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();

    while(T-- > 0){
      n = scanner.nextInt();
      arr = new int[n + 1][2];
      dy = new int[n + 1][3];

      for(int i = 0; i < 2; i++){
        for(int j = 1; j <= n; j++){
          arr[j][i] = scanner.nextInt();
        }
      }

      dy[1][1] = arr[1][0];
      dy[1][2] = arr[1][1];

      for(int i = 2; i <= n; i++){
        for(int j = 0; j <= 2; j++){
          dy[i][0] = Math.max(dy[i][0], dy[i - 1][j]);

          for(int k = 0; k <= 1; k++){
            if((j & (1 << k)) != 0){
              continue;
            }

            dy[i][1 << k] = Math.max(dy[i][1 << k], dy[i - 1][j] + arr[i][k]);
          }
        }
      }

      System.out.println(Math.max(Math.max(dy[n][0], dy[n][1]), dy[n][2]));
    }
  }
}
