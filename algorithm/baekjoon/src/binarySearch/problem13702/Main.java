package binarySearch.problem13702;

import java.util.Scanner;

public class Main {
  static int N, K;
  static int[] arr;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    K = scanner.nextInt();
    arr = new int[N + 1];

    for(int i = 1; i <= N; i++){
      arr[i] = scanner.nextInt();
    }

    long L = 0;
    long R = Integer.MAX_VALUE;
    long result = 0;

    while(L <= R){
      long M = (L + R) / 2;

      if(determinate(M)){
        result = M;
        L = M + 1;
      }else{
        R = M - 1;
      }
    }

    System.out.println(result);
  }

  static boolean determinate(long amount){
    if(amount == 0){
      return false;
    }

    long sum = 0;

    for(int i = 1; i <= N; i++){
      sum += arr[i] / amount;
    }

    return sum >= K;
  }
}
