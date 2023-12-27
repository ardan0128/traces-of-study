package dynamicProgramming.problem1949;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static int N;
  static int[] people;
  static ArrayList<Integer>[] tree;
  static int[][] dy;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    people = new int[N + 1];
    tree = new ArrayList[N + 1];

    for(int i = 1; i <= N; i++){
      people[i] = scanner.nextInt();
      tree[i] = new ArrayList<>();
    }

    for(int i = 1; i < N; i++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      tree[x].add(y);
      tree[y].add(x);
    }

    dy = new int[N + 1][2];

    dfs(1, -1);

    System.out.println(Math.max(dy[1][0], dy[1][1]));
  }

  static void dfs(int x, int pre){
    dy[x][1] = people[x];

    for(int y : tree[x]){
      if(y == pre){
        continue;
      }

      dfs(y, x);

      dy[x][0] += Math.max(dy[y][0], dy[y][1]);
      dy[x][1] += dy[y][0];
    }
  }
}
