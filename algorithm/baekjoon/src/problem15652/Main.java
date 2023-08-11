package problem15652;

import java.util.Scanner;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static int N, M;
  static int[] selected;

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    N = scan.nextInt();
    M = scan.nextInt();
    selected = new int[M + 1];
    solution(1);
    System.out.println(sb);
  }

  static void solution(int n){
    if(n == M + 1){
      for(int i = 1; i <= M; i++){
        sb.append(selected[i]).append(' ');
      }
      sb.append('\n');
    }else{
      int start = selected[n - 1];
      if(start == 0) {
        start = 1;
      }
      for(int i = start; i <= N; i++){
        selected[n] = i;
        solution(n + 1);
      }
    }
  }
}
