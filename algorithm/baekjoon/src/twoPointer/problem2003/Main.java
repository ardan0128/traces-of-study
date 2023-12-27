package twoPointer.problem2003;

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

    int sum = 0;
    int R = 0;
    int count = 0;

    for(int L = 1; L <= N; L++){
      sum -= A[L - 1];

      while(R + 1 <= N && sum < M){
        sum += A[++R];
      }

      if(sum == M){
        count++;
      }
    }

    System.out.println(count);
  }
}
