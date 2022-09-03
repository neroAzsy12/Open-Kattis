import java.io.*;
import java.util.StringTokenizer;

// Input: X, Y, and N where (1 ≤ X < Y ≤ N ≤ 100)
public class fizzbuzz {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());

    for (int i = 1; i <= n; i++) {
      if (i % x == 0 && i % y == 0) {
        System.out.println("FizzBuzz");
      } else if (i % x == 0) {
        System.out.println("Fizz");
      } else if (i % y == 0) { 
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}