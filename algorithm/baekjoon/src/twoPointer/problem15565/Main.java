package twoPointer.problem15565;

import java.util.Scanner;

public class Main {
  static int N, K;
  static int house[];

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    K = scanner.nextInt();
    house = new int[N + 1];

    for(int i = 1; i <= N; i++){
      house[i] = scanner.nextInt();
    }

    int right = 0;
    int count = 0;
    int result = -1;

    for(int left = 1; left <= N; left++){
      while (right < N && count < K){
        right++;

        if(house[right] == 1){
          count++;
        }
      }

      if(count == K){
        if(result == -1){
          result = right - left + 1;
        }
        result = Math.min(result, right - left + 1);
      }

      if(house[left] == 1){
        count--;
      }
    }

    System.out.println(result);
  }
}
