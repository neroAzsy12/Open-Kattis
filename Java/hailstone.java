import java.io.*;

public class hailstone {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long num = Long.parseLong(br.readLine());
    long result = 0;

    while (num != 1) {
      result += num;
      if (num % 2 == 0) {
        num /= 2;
      } else {
        num = (3 * num) + 1;
      }
    }
    result++;

    System.out.println(result);
  }  
}
