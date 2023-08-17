package problem15970;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  static int N;
  static ArrayList<Integer>[] dots;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    dots = new ArrayList[N + 1];

    for(int i = 1; i <= N; i++){
      dots[i] = new ArrayList<Integer>();
    }

    for(int i = 1; i <= N; i++){
      int dot, color;
      dot = scanner.nextInt();
      color = scanner.nextInt();
      dots[color].add(dot);
    }

    for(int i = 1; i <= N; i++){
      Collections.sort(dots[i]);
    }

    int result = 0;

    for(int i = 1; i <= N; i++){
      for(int j = 0; j < dots[i].size(); j++){
        int left = getLeft(i, j);
        int right = getRight(i, j);
        result += Math.min(left, right);
      }
    }

    System.out.println(result);
  }

  static int getLeft(int color, int idx){
    if(idx == 0) return Integer.MAX_VALUE;
    return dots[color].get(idx) - dots[color].get(idx - 1);
  }

  static int getRight(int color, int idx){
    if(idx + 1 == dots[color].size()) return Integer.MAX_VALUE;
    return dots[color].get(idx + 1) - dots[color].get(idx);
  }
}
