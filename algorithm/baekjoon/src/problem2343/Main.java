package problem2343;

import java.util.Scanner;

public class Main {
  static int N, M;
  static int[] arr;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    M = scanner.nextInt();
    arr = new int[N + 1];

    for(int i = 1; i <= N; i++){
      arr[i] = scanner.nextInt();
    }

    int L = arr[1];
    int R = 1000000000;
    int result = 0;

    for(int i = 1; i <= N; i++){
      L = Math.max(L, arr[i]);
    }

    while(L <= R){
      int m = (L + R) / 2;

      if(determinate(m)){
        result = m;
        R = m - 1;
      }else{
        L = m + 1;
      }
    }

    System.out.println(result);
  }

  static boolean determinate(int length){
    int count = 1;
    int sum = 0;

    for(int i = 1; i <= N; i++){
      if(sum + arr[i] > length){
        count++;
        sum = arr[i];
      }else{
        sum += arr[i];
      }
    }

    return count <= M;
  }
}
