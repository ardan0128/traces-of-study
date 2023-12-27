package binarySearch.problem10816;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static int N, M;
  static int[] A, B;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    A = new int[N + 1];

    for(int i = 1; i <= N; i++){
      A[i] = scanner.nextInt();
    }

    M = scanner.nextInt();
    B = new int[M + 1];

    for(int i = 1; i <= M; i++){
      B[i] = scanner.nextInt();
    }

    Arrays.sort(A, 1, N + 1);

//    for(int i = 1; i <= M; i++){
//      int right = rightBinarySearch(i);
//      int left = leftBinarySearch(i);
//
//      sb.append(Math.max(left, right)).append(' ');
//    }

    for(int i = 1; i <= M; i++){
      int upper = upperBound(A, 1, N, B[i]);
      int lower = lowerBound(A, 1, N, B[i]);

      sb.append(upper - lower).append(' ');
    }

    System.out.println(sb);
  }

  static int rightBinarySearch(int num){
    int L = 1;
    int R = N;
    int count = 0;

    while(L <= R){
      int M = (L + R) / 2;

      if(A[M] == B[num]){
        count++;
      }

      if(A[M] < B[num]){
        L = M + 1;
      }else{
        R = M - 1;
      }
    }

    return count;
  }

  static int leftBinarySearch(int num){
    int L = 1;
    int R = N;
    int count = 0;

    while(L <= R){
      int M = (L + R) / 2;

      if(A[M] == B[num]){
        count++;
      }

      if(A[M] > B[num]){
        R = M - 1;
      }else{
        L = M + 1;
      }
    }

    return count;
  }

  static int lowerBound(int[] A, int L, int R, int X){
    int result = R + 1;
    while(L <= R){
      int M = (L + R) / 2;

      if(A[M] >= X){
        result = M;
        R = M - 1;
      }else{
        L = M + 1;
      }
    }

    return result;
  }

  static int upperBound(int[] A, int L, int R, int X){
    int result = R + 1;
    while(L <= R){
      int M = (L + R) / 2;

      if(A[M] > X){
        result = M;
        R = M - 1;
      }else{
        L = M + 1;
      }
    }

    return result;
  }
}
