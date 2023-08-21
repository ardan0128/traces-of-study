package problem16472;

import java.util.Scanner;

public class Main {
  static int N, count;
  static String str;
  static int[] strCount;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    str = scanner.next();
    strCount = new int[26];

    soulution();
  }

  static void soulution(){
    int result = 0;

    for(int R = 0, L = 0; R < str.length(); R++){
      add(str.charAt(R));

      while(count > N) {
        minus(str.charAt(L++));
      }

      result = Math.max(result, R - L + 1);
    }

    System.out.println(result);
  }

  static void add(char c){
    strCount[c - 'a']++;
    if(strCount[c - 'a'] == 1){
      count++;
    }
  }

  static void minus(char c){
    strCount[c - 'a']--;
    if(strCount[c - 'a'] == 0){
      count--;
    }
  }
}
