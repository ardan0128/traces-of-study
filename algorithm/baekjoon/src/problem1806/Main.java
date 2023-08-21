package problem1806;

import java.util.Scanner;

public class Main {
  static int N, S;
  static int[] arr;
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    arr = new int[N + 1];
    S = scanner.nextInt();

    for(int i = 1; i <= N; i++){
      arr[i] = scanner.nextInt();
    }

    int R = 0, sum = 0, result = N + 1;

    for(int L = 1; L <= N; L++) {
      sum -= arr[L - 1];

      while(R + 1 <= N && sum < S){
        sum += arr[++R];
      }

      if (sum >= S) {
        result = Math.min(result, R - L + 1);
      }
    }

    if(result == N + 1){
      result = 0;
    }

    System.out.println(result);
  }
}
