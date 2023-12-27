package binarySearch.problem1654;

import java.util.Scanner;

public class Main {
  static int K, N;
  static int[] lines;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    K = scanner.nextInt();
    N = scanner.nextInt();
    lines = new int[K + 1];

    for(int i = 1; i <= K; i++){
      lines[i] = scanner.nextInt();
    }

    long L = 1;
    long R = Integer.MAX_VALUE;
    long result = 0;

    while(L <= R){
      long M = (L + R) / 2;

      if(determination(M)){
        result = M;
        L = M + 1;
      }else{
        R = M - 1;
      }
    }

    System.out.println(result);
  }

  static boolean determination(long length){
    long sum = 0;

    for(int i = 1; i <= K; i++){
      sum += lines[i] / length;
    }

    return sum >= N;
  }
}
