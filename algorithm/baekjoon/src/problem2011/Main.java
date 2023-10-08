package problem2011;

import java.util.Scanner;

public class Main {
  static String StrN;
  static int N;
  static int[] dy;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    StrN = scanner.next();
    N = StrN.length();
    dy = new int[N];

    if(StrN.charAt(0) != '0'){
      dy[0] = 1;
    }

    for(int i = 1; i < N; i++){
      if(StrN.charAt(i) != '0'){
        dy[i] = dy[i - 1];
      }

      if(check(StrN.charAt(i - 1), StrN.charAt(i))){
        if(i >= 2){
          dy[i] += dy[i - 2];
        }else{
          dy[i] += 1;
        }

        dy[i] %= 1000000;
      }
    }

    System.out.println(dy[N - 1]);
  }

  static boolean check(char A, char B){
    if(A == '0'){
      return false;
    }

    if(A == '1'){
      return true;
    }

    if(A >= '3'){
      return false;
    }

    return B <= '6';
  }
}
