import java.io.*;
import java.util.*;

public class chanukah {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cases = Integer.parseInt(br.readLine());

    for (int i = 1; i <= cases; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int k = Integer.parseInt(st.nextToken());
      int n = Integer.parseInt(st.nextToken());

      System.out.println(k + " " + ((n * (n + 1) / 2) + n));
    }
  }
}
