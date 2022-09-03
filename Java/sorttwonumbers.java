import java.io.*;
import java.util.StringTokenizer;

public class sorttwonumbers {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    if (a > b) {
      System.out.println(b + " " + a);
    } else {
      System.out.println(a + " " + b);
    }
  }
}