package binarySearch.problem1637;

import java.util.Scanner;

public class Main {
  static int N;
  static int[][] nums;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    nums = new int[N + 1][3];

    for(int i = 1; i <= N; i++){
      for(int j = 0; j < 3; j++){
        nums[i][j] = scanner.nextInt();
      }
    }

    long L = 1;
    long R = Integer.MAX_VALUE;
    long result = 0;
    long count = 0;

    while(L <= R){
      long M = (L + R) / 2;

      if(determination((int) M)){
        result = M;
        R = M - 1;
      }else{
        L = M + 1;
      }
    }

    if(result == 0){
      System.out.println("NOTHING");
    }else{
      for(int i = 1; i <= N; i++){
        if (nums[i][0] <= result && result <= nums[i][1] && (result - nums[i][0]) % nums[i][2] == 0) {
          count++;
        }
      }

      System.out.println(result + " " + count);
    }
  }

  static int count(int A, int C, int B, int X){
    if(X < A){
      return 0;
    }

    if(C < X){
      return (C - A) / B + 1;
    }

    return (X - A) / B + 1;
  }

  static boolean determination(int candidate){
    long sum = 0;

    for(int i = 1; i <= N; i++){
      sum += count(nums[i][0], nums[i][1], nums[i][2], candidate);
    }

    return sum % 2 == 1;
  }
}
