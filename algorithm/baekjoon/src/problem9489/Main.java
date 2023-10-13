package problem9489;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
  static int N, K;
  static int[] arr, par;

  public static void main(String[] args){
    FastReader scanner = new FastReader();

    while(true){
      N = scanner.nextInt();
      K = scanner.nextInt();

      if(N == 0 & K == 0){
        break;
      }

      arr = new int[N + 1];
      par = new int[N + 1];

      for(int i = 1; i <= N; i++){
        arr[i] = scanner.nextInt();
      }

      par[0] = -1;
      par[1] = 0;
      int last = 1;

      for(int i = 2; i <= N; i++, last++){
        for(; i <= N; i++){
          par[i] = last;

          if(i < N && arr[i] + 1 != arr[i + 1]){
            break;
          }
        }
      }

      int kIdx = 0;

      for(int i = 1; i <= N; i++){
        if(arr[i] == K){
          kIdx = i;
        }
      }

      int result = 0;

      for(int i = 1; i <= N; i++){
        if(par[par[i]] == par[par[kIdx]] && par[i] != par[kIdx]){
          result++;
        }
      }

      System.out.println(result);
    }
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
