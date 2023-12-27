package shortestPath.problem1916;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  static int N, M, start, end;
  static int[] dist;
  static ArrayList<Edge>[] edges;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    M = scanner.nextInt();
    dist = new int[N + 1];
    edges = new ArrayList[N + 1];

    for(int i = 1; i <= N; i++){
      edges[i] = new ArrayList<Edge>();
    }

    for(int i = 1; i <= M; i++){
      int from = scanner.nextInt();
      int to = scanner.nextInt();
      int weight = scanner.nextInt();
      edges[from].add(new Edge(to, weight));
    }

    start = scanner.nextInt();
    end = scanner.nextInt();

    dijkstra(start);

    System.out.println(dist[end]);
  }

  static void dijkstra(int start){
    for(int i = 1; i <= N; i++){
      dist[i] = Integer.MAX_VALUE;
    }

    PriorityQueue<Info> pq = new PriorityQueue<>(Comparator.comparing(o -> o.dist));

    pq.add(new Info(start, 0));
    dist[start] = 0;

    while(!pq.isEmpty()){
      Info info = pq.poll();

      if(dist[info.idx] != info.dist){
        continue;
      }

      for(Edge e : edges[info.idx]){
        if(dist[info.idx] + e.weight >= dist[e.to]){
          continue;
        }

        dist[e.to] = dist[info.idx] + e.weight;
        pq.add(new Info(e.to, dist[e.to]));
      }
    }
  }

  static class Edge {
    public int to;
    public int weight;

    public Edge(int to, int weight){
      this.to = to;
      this.weight = weight;
    }
  }

  static class Info {
    int idx;
    int dist;

    public Info(int idx, int dist){
      this.idx = idx;
      this.dist = dist;
    }
  }
}
