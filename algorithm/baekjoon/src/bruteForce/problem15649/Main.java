package bruteForce.problem15649;

import java.util.Scanner;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static int N, M;
  static int[] selected, used;
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    N = scan.nextInt();
    M = scan.nextInt();
    selected = new int[M + 1];
    used = new int[N + 1];

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
        if(used[i] == 1){
          continue;
        }
        selected[n] = i;
        used[i] = 1;
        solution(n + 1);
        used[i] = 0;
      }
    }
  }
}
