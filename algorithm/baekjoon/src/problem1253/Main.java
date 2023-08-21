package problem1253;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  static int N;
  static int[] arr;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    arr = new int[N + 1];
    for(int i = 1; i <= N; i++){
      arr[i] = scanner.nextInt();
    }

    Arrays.sort(arr, 1, N + 1);

    int result = 0;
    for(int i = 1; i <= N; i++){
      if(targetCheck(i)){
        result++;
      }
    }

    System.out.println(result);
  }

  static boolean targetCheck(int targetIdx){
    int L = 1, R = N;
    int target = arr[targetIdx];

    while(L < R){
      if(L == targetIdx){
        L++;
      }else if(R == targetIdx){
        R--;
      }else{
        if(arr[L] + arr[R] == target){
          return true;
        }else if(arr[L] + arr[R] > target){
          R--;
        }else{
          L++;
        }
      }
    }

    return false;
  }
}