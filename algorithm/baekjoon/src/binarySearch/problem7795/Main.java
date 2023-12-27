package binarySearch.problem7795;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static int N, M, T;
  static int[] A, B;

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){
    T = scanner.nextInt();

    for(int i = 1; i <= T; i++){
      input();
      Arrays.sort(B, 1, M + 1);

      int result = 0;
      for(int j = 1; j <= N; j++){
        result += solution(B, 1, M, A[j]);
      }

      System.out.println(result);
    }
  }

  static void input(){
    N = scanner.nextInt();
    M = scanner.nextInt();
    A = new int[N + 1];
    B = new int[M + 1];

    for(int i = 1; i <= N; i++){
      A[i] = scanner.nextInt();
    }

    for(int i = 1; i <= M; i++){
      B[i] = scanner.nextInt();
    }
  }

  static int solution(int[] arr, int l, int r, int x){
    int result = l - 1;

    while(l <= r){
      int m = (l + r) / 2;
      if(arr[m] < x){
        result = m;
        l = m + 1;
      }else{
        r = m - 1;
      }
    }

    return result;
  }
}
