package problem15649;

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
      for(int i = 1; i <= N; i++){
        boolean isUsed = false;
        for(int j = 1; j < n; j++){
          if(i == selected[j]){
            isUsed = true;
          }
        }

        if(!isUsed){
          selected[n] = i;
          solution(n + 1);
        }
      }
    }
  }
}
