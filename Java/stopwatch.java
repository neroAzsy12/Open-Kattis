import java.io.*;

public class stopwatch {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    if (n % 2 != 0) {
      System.out.println("still running");
    } else {
      int sum = 0;

      while (n > 0) {
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        sum += (b - a);
        n -= 2;
      }

      System.out.println(sum);
    }
  }
}
