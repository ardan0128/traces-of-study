package problem2470;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static int N;
  static int[] A;
  public static void main(String[] args){
    FastReader scanner = new FastReader();
    N = scanner.nextInt();
    A = new int[N + 1];
    for(int i = 1; i <= N; i++){
      A[i] = scanner.nextInt();
    }

    solution();
    System.out.println(sb);
  }

  static void solution(){
    Arrays.sort(A, 1, N + 1);

    int sum = Integer.MAX_VALUE;
    int v1 = 0, v2 = 0;

    for(int i = 1; i <= N - 1; i++){
      int value = lowerBound(A, i + 1, N, -A[i]);

      if(i < value - 1 && Math.abs(A[i] + A[value - 1]) < sum){
        sum = Math.abs(A[i] + A[value - 1]);
        v1 = A[i];
        v2 = A[value - 1];
      }

      if(value <= N && Math.abs(A[i] + A[value]) < sum){
        sum = Math.abs(A[i] + A[value]);
        v1 = A[i];
        v2 = A[value];
      }
    }

    sb.append(v1).append(' ').append(v2);
  }

  static int lowerBound(int[] arr, int l, int r, int x){
    int result = r + 1;

    while (l <= r){
      int m = (l + r) / 2;

      if(arr[m] >= x){
        result = m;
        r = m - 1;
      }else{
        l = m + 1;
      }
    }

    return result;
  }

  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    public FastReader(String s) throws FileNotFoundException {
      br = new BufferedReader(new FileReader(new File(s)));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}
