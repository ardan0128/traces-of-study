package binarySearch.problem2512;

import java.util.Scanner;

public class Main {
  static int N, M;
  static int[] arr;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    arr = new int[N + 1];

    int L = 0;
    int R = 0;
    int result = 0;

    for(int i = 1; i <= N; i++){
      arr[i] = scanner.nextInt();
      R = Math.max(R, arr[i]);
    }

    M = scanner.nextInt();

    while(L <= R){
      int m = (L + R) / 2;

      if(determinate(m)){
        result = m;
        L = m + 1;
      }else{
        R = m - 1;
      }
    }

    System.out.println(result);
  }

  static boolean determinate(int limit){
    int sum = 0;

    for(int i = 1; i <= N; i++){
      sum += Math.min(arr[i], limit);
    }

    return sum <= M;
  }
}
