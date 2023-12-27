package binarySearch.problem2110;

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

    Arrays.sort(A, 1, N + 1);
    int l = 0, r = 1000000000, result = 0;

    while(l <= r){
      int m = (l + r) / 2;
      if(solution(m)){
        result = m;
        l = m + 1;
      }else{
        r = m - 1;
      }
    }

    System.out.println(result);
  }

  static boolean solution(int x){
    int count = 1, last = A[1];

    for(int i = 2; i <= N; i++){
      if(A[i] - last >= x){
        count++;
        last = A[i];
      }
    }

    return count >= M;
  }
}
