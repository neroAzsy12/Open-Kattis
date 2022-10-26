import java.io.*;
import java.util.*;

public class electricaloutlets {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cases = Integer.parseInt(br.readLine());

    for (int i = 0; i < cases; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int strips = Integer.parseInt(st.nextToken());

      int sum = 0;
      while (st.hasMoreTokens()) {
        int outlets = Integer.parseInt(st.nextToken());
        sum += outlets;
      }

      System.out.println(sum - (strips - 1));
    }
  }
}
