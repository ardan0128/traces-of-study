package problem11728;

import java.util.Scanner;

public class Main {
  static int N, M;
  static int[] A, B;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
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

    int a = 1, b = 1;
    StringBuilder sb = new StringBuilder();

    while(a <= N && b <= M){
      if(A[a] <= B[b]){
        sb.append(A[a++]).append(" ");
      }else{
        sb.append(B[b++]).append(" ");
      }
    }

    while(a <= N){
      sb.append(A[a++]).append(" ");
    }

    while(b <= M){
      sb.append(B[b++]).append(" ");
    }

    System.out.println(sb);
  }
}
