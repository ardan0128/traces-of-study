package problem2473;

import java.util.Arrays;
import java.util.Scanner;

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

    long sum = Long.MAX_VALUE;
    int v1 = 0;
    int v2 = 0;
    int v3 = 0;

    for(int i = 1; i <= N - 2; i++){
      int target = -arr[i];
      int L = i + 1;
      int R = N;

      while(L < R){
        if(sum > Math.abs(-(long) target + arr[L] + arr[R])){
          sum = Math.abs(-(long) target + arr[L] + arr[R]);
          v1 = -target;
          v2 = arr[L];
          v3 = arr[R];
        }

        if(arr[L] + arr[R] > target){
          R--;
        }else{
          L++;
        }
      }
    }

    System.out.println(v1 + " " + v2 + " " + v3);
  }
}
