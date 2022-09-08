import java.io.*;
import java.util.StringTokenizer;

public class grading {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int d = Integer.parseInt(st.nextToken());
    int e = Integer.parseInt(st.nextToken());
    int score = Integer.parseInt(br.readLine());

    if (score >= a) {
      System.out.println("A");
    } else if (score >= b) {
      System.out.println("B");
    } else if (score >= c) {
      System.out.println("C");
    } else if (score >= d) {
      System.out.println("D");
    } else if (score >= e) {
      System.out.println("E");
    }else {
      System.out.println("F");
    }
  }
}