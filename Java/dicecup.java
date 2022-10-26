import java.io.*;
import java.util.*;

public class dicecup {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); 
    int m = Integer.parseInt(st.nextToken());

    if (n == m) System.out.println(n + 1);
    else {
      int start = Math.min(n, m) + 1;
      int end = Math.abs(n - m) + 1;

      for (int i = start; i < start + end; i++) {
        System.out.println(i);
      }
    }
  }
}
