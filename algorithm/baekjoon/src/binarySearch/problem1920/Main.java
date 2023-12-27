package binarySearch.problem1920;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static int N, M;
  static long[] A, B;

  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    A = new long[N];

    for(int i = 0; i < N; i++){
      A[i] = scanner.nextInt();
    }

    M = scanner.nextInt();
    B = new long[M];

    for(int i = 0; i < M; i++){
      B[i] = scanner.nextInt();
    }

    Arrays.sort(A);

    for(int i = 0; i < B.length; i++){
      int L = 0;
      int R = A.length - 1;

      while(L <= R){
        int M = (L + R) / 2;

        if(A[M] == B[i]){
          sb.append(1).append('\n');
          break;
        }else if(B[i] > A[M]){
          L = M + 1;
        }else{
          R = M - 1;
        }
      }

      if(L > R){
        sb.append(0).append('\n');
      }
    }

    System.out.println(sb);
  }
}
