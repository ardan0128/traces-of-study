package problem14888;

import java.util.Scanner;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static int N, min, max;
  static int[] nums, operators, orders;

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    N = scan.nextInt();
    nums = new int[N + 1];
    operators = new int[5];
    for(int i = 1; i <= N; i++) nums[i] = scan.nextInt();
    for(int i = 1; i <= 4; i++) operators[i] = scan.nextInt();
    max = Integer.MIN_VALUE;
    min = Integer.MAX_VALUE;

    solution(1, nums[1]);
    sb.append(max).append('\n').append(min);
    System.out.println(sb.toString());
  }

  static void solution(int n, int value){
    if(n == N){
      max = Math.max(max, value);
      min = Math.min(min, value);
    }else{
      for(int i = 1; i <= 4; i++){
        if(operators[i] > 0){
          operators[i]--;
          solution(n + 1, calculator(value, nums[n + 1], i));
          operators[i]++;
        }
      }
    }
  }

  static int calculator(int preNum, int nowNum, int operator){
    if(operator == 1) return preNum + nowNum;
    else if(operator == 2) return preNum - nowNum;
    else if(operator == 3) return preNum * nowNum;
    else return preNum / nowNum;
  }
}
