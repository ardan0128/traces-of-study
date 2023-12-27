package binarySearch.problem17266;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static int N, M;
  static int[] arr;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    M = scanner.nextInt();
    arr = new int[M + 1];

    for(int i = 1; i <= M; i++){
      arr[i] = scanner.nextInt();
    }

    int L = 0;
    int R = N;
    int result = N;

    Arrays.sort(arr, 1, M + 1);

    while(L <= R){
      int MID = (L + R) / 2;

      if(determinate(MID)){
        result = MID;
        R = MID - 1;
      }else{
        L = MID + 1;
      }
    }

    System.out.println(result);
  }

  static boolean determinate(int height){
    int last = 0;

    for(int i = 1; i <= M; i++){
      if(arr[i] - last <= height){
        last = arr[i] + height;
      }else{
        return false;
      }
    }

    return last >= N;
  }
}
