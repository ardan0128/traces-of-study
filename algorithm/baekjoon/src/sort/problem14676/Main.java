package sort.problem14676;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static int N, M, K;
  static int[] indeg;
  static int[] count;
  static int[] satisfaction;
  static ArrayList<Integer>[] adj;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    M = scanner.nextInt();
    K = scanner.nextInt();
    adj = new ArrayList[N + 1];
    indeg = new int[N + 1];
    count = new int[N + 1];
    satisfaction = new int[N + 1];

    for(int i = 1; i <= N; i++){
      adj[i] = new ArrayList<>();
    }

    for(int i = 0; i < M; i++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      adj[x].add(y);
      indeg[y]++;
    }

    boolean flag = false;

    while(K-- > 0){
      int t = scanner.nextInt();
      int x = scanner.nextInt();

      if(t == 1){
        if(satisfaction[x] < indeg[x]){
          flag = true;
        }

        count[x]++;

        if(count[x] == 1){
          for(int y : adj[x]){
            satisfaction[y]++;
          }
        }
      }else{
        if(count[x] == 0){
          flag = true;
        }

        count[x]--;

        if(count[x] == 0){
          for(int y : adj[x]){
            satisfaction[y]--;
          }
        }
      }
    }

    if(flag){
      System.out.println("Lier!");
    }else{
      System.out.println("King-God-Emperor");
    }
  }
}
