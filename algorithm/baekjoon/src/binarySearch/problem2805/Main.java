package binarySearch.problem2805;

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

    long L = 0, R = 2000000000, result = 0;

    while(L <= R){
      int m = (int) (L + R) / 2;

      if(solution(m)){
        result = m;
        L = m + 1;
      }else{
        R = m - 1;
      }
    }

    System.out.println(result);
  }

  static boolean solution(int H){
    long sum = 0;
    for(int i = 1; i <= N; i++){
      if(A[i] > H){
        sum += A[i] - H;
      }
    }

    return sum >= M;
  }
}
