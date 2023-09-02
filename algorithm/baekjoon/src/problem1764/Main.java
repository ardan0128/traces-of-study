package problem1764;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static int N, M;
  static String[] nPeople, mPeople;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    nPeople = new String[N + 1];
    M = scanner.nextInt();
    mPeople = new String[M + 1];

    for(int i = 1; i <= N; i++){
      nPeople[i] = scanner.next();
    }

    for(int i = 1; i <= M; i++){
      mPeople[i] = scanner.next();
    }

    Arrays.sort(nPeople, 1, N + 1);
    Arrays.sort(mPeople, 1, M + 1);

    StringBuilder sb = new StringBuilder();
    int count = 0;

    for(int i = 1; i <= M; i++){
      int L = 1, R = N;

      while(L <= R){
        int m = (L + R) / 2;

        if(nPeople[m].equals(mPeople[i])){
          count++;
          sb.append(nPeople[m]).append('\n');
          break;
        }else if(nPeople[m].compareTo(mPeople[i]) < 0){
          L = m + 1;
        }else{
          R = m - 1;
        }
      }
    }

    System.out.println(count);
    System.out.println(sb);
  }
}
