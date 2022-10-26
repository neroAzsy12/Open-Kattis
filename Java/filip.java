import java.io.*;
import java.util.*;

public class filip {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int ra = 0, rb = 0; // reversed a and b
    for (int i = 0; i < 3; i++) {
      ra += (a % 10) * Math.pow(10, 2 - i);
      rb += (b % 10) * Math.pow(10, 2 - i);

      a /= 10;
      b /= 10;
    }

    System.out.println(Math.max(ra, rb));
  }
}
