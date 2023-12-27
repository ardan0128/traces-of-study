package graph.problem2667;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static int N, groupCount;
  static String[] arr;
  static boolean[][] visit;
  static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
  static ArrayList<Integer> group;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    arr = new String[N];

    for(int i = 0; i < N; i++){
      arr[i] = scanner.next();
    }

    visit = new boolean[N][N];
    group = new ArrayList<>();

    for(int i = 0; i < N; i++){
      for(int j = 0; j < N; j++){
        if(!visit[i][j] && arr[i].charAt(j) == '1'){
          groupCount = 0;
          dfs(i, j);
          group.add(groupCount);
        }
      }
    }

    Collections.sort(group);
    sb.append(group.size()).append('\n');

    for(int count: group){
      sb.append(count).append('\n');
    }

    System.out.println(sb.toString());
  }

  static void dfs(int x, int y){
    groupCount++;
    visit[x][y] = true;
    for(int i = 0; i < 4; i++){
      int ix = x + dir[i][0];
      int iy = y + dir[i][1];

      if(ix < 0 || iy < 0 || ix >= N || iy >= N){
        continue;
      }
      if(arr[ix].charAt(iy) == '0'){
        continue;
      }
      if(visit[ix][iy]){
        continue;
      }

      dfs(ix, iy);
    }
  }
}
