package twoPointer.problem3273;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static int N;
  static int[] nums;
  static int X;
  static int count;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    nums = new int[N + 1];

    for(int i = 1; i <= N; i++){
      nums[i] = scanner.nextInt();
    }

    X = scanner.nextInt();

    Arrays.sort(nums, 1, N + 1);

    solutionTwoPointer();
  }

  static void binarySearch(int num){
    int L = num + 1;
    int R = N;

    while(L <= R){
      int M = (L + R) / 2;

      if(nums[num] + nums[M] == X){
        count++;
      }

      if(nums[num] + nums[M] < X){
        L = M + 1;
      }else{
        R = M - 1;
      }
    }
  }

  static void solutionBinarySearch(){
    count = 0;

    for(int i = 1; i <= N; i++){
      binarySearch(i);
    }

    System.out.println(count);
  }

  static void solutionTwoPointer(){
    count = 0;
    int L = 1;
    int R = N;

    while(L < R){
      if(nums[L] + nums[R] == X){
        count++;
      }

      if(nums[L] + nums[R] >= X){
        R--;
      }else{
        L++;
      }
    }

    System.out.println(count);
  }
}
