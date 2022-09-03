import java.io.*;

public class hailstone {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long num = Long.parseLong(br.readLine());
    long result = 0;

    while (num != 1) {
      if (num % 2 == 0) {
        result += num;
        num /= 2;
      } else {
        result += num;
        num = (3 * num) + 1;
      }
    }
    result++;

    System.out.println(result);
  }  
}