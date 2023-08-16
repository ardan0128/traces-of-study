package problem11652;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    long[] cardes = new long[N + 1];

    for(int i = 1; i < N + 1; i++){
      cardes[i] = scanner.nextLong();
    }

    Arrays.sort(cardes, 1, N + 1);
    long nowCard = cardes[1];
    int nowCardCount = 1;
    int maxCardCount = 1;

    for(int i = 2; i < N + 1; i++){
      if(cardes[i] == cardes[i - 1]){
        nowCardCount++;
      }else{
        nowCardCount = 1;
      }

      if(nowCardCount > maxCardCount){
        nowCard = cardes[i];
        maxCardCount = nowCardCount;
      }
    }

    System.out.println(nowCard);
  }
}
