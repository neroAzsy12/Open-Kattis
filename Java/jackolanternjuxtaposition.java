import java.io.*;
import java.util.StringTokenizer;

public class jackolanternjuxtaposition {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // num of eye designs
    int t = Integer.parseInt(st.nextToken()); // num of nose designs
    int m = Integer.parseInt(st.nextToken()); // num of mouth designs

    System.out.println(n * t * m);  // num of different possible designs
  }
}
