package problem1068;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  static int N, R, erased;
  static List<Integer>[] child;
  static int[] leaf;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    child = new ArrayList[N];
    leaf = new int[N];

    for(int i = 0; i < N; i++){
      child[i] = new ArrayList<>();
    }

    for(int i = 0; i < N; i++){
      int parent = scanner.nextInt();

      if(parent == -1){
        R = i;
        continue;
      }

      child[parent].add(i);
    }

    erased = scanner.nextInt();

    for(int i = 0; i < N; i++){
      if(child[i].contains(erased)){
        child[i].remove(child[i].indexOf(erased));
      }
    }

    if(R != erased){
      dfs(R, -1);
    }

    System.out.println(leaf[R]);
  }

  static void dfs(int x, int parent){
    if(child[x].isEmpty()){
      leaf[x]++;
    }

    for(int y : child[x]){
      if(y == parent){
        continue;
      }

      dfs(y, x);
      leaf[x] += leaf[y];
    }
  }
}
