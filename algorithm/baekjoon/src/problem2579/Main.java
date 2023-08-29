package problem2579;

import java.util.Scanner;

public class Main {
  static int N;
  static int[][] Dy;
  static int[] A;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    A = new int[N + 1];
    Dy = new int[N + 1][2];

    for(int i = 1; i <= N; i++){
      A[i] = scanner.nextInt();
    }

    Dy[1][0] = 0;
    Dy[1][1] = A[1];

    if(N >= 2){
      Dy[2][0] = A[2];
      Dy[2][1] = A[1] + A[2];
    }

    for(int i = 3; i <= N; i++){
      Dy[i][0] = Math.max(Dy[i - 2][0] + A[i], Dy[i - 2][1] + A[i]);
      Dy[i][1] = Dy[i - 1][0] + A[i];
    }

    System.out.println(Math.max(Dy[N][0], Dy[N][1]));
  }
}
