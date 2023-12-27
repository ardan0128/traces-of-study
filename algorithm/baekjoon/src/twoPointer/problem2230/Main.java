package twoPointer.problem2230;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static int N, M;
  static int[] A;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    M = scanner.nextInt();
    A = new int[N + 1];

    for(int i = 1; i <= N; i++){
      A[i] = scanner.nextInt();
    }

    Arrays.sort(A);

    int R = 1;
    int result = Integer.MAX_VALUE;

    for(int L = 1; L <= N; L++){
      while(R + 1 <= N && A[R] - A[L] < M){
        ++R;
      }

      if(A[R] - A[L] >= M){
        result = Math.min(result, A[R] - A[L]);
      }
    }

    System.out.println(result);
  }
}
