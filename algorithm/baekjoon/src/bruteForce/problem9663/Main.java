package bruteForce.problem9663;

import java.util.Scanner;

public class Main {
  static int N, result;
  static int[] queen;

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    N = scan.nextInt();
    queen = new int[N + 1];
    solution(1);
    System.out.println(result);
  }

  static void solution(int n){
    if(n == N + 1){
      result++;
    }else{
      for(int i = 1; i <= N; i++){
        boolean isPossible = true;
        for(int j = 1; j <= n - 1; j++){
          if(attackCheck(n, i, j, queen[j])){
            isPossible = false;
            break;
          }
        }
        if(isPossible) {
          queen[n] = i;
          solution(n + 1);
        }
      }
    }
  }

  static boolean attackCheck(int r1, int c1, int r2, int c2){
    if(c1 == c2) return true;
    if(r1 - c1 == r2 - c2) return true;
    if(r1 + c1 == r2 + c2) return true;
    return false;
  }
}
