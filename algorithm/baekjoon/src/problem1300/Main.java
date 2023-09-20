package problem1300;

import java.util.Scanner;

public class Main {
  static int N, K;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    K = scanner.nextInt();

    long L = 1;
    long R = (long) N * N;
    long result = 0;

    while(L <= R){
      long M = (L + R) / 2;

      if(determinate(M)){
        result = M;
        R = M - 1;
      }else{
        L = M + 1;
      }
    }

    System.out.println(result);
  }

  static boolean determinate(long val){
    long sum = 0;

    for(int i = 1; i <= N; i++){
      sum += Math.min(N, val / i);
    }

    return sum >= K;
  }
}
