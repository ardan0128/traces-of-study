package problem1182;

import java.util.Scanner;

public class Main {
  static int N, S, result;
  static int[] nums;
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    N = scan.nextInt();
    S = scan.nextInt();
    nums = new int[N + 1];
    for(int i = 1; i <= N; i++) nums[i] = scan.nextInt();

    solution(1, 0);

    if(S == 0) result--;

    System.out.println(result);
  }

  static void solution(int n, int value){
    if(n == N + 1){
      if(value == S) result++;
    }else{
      solution(n + 1, value + nums[n]);
      solution(n + 1, value);
    }
  }
}
