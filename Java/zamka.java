import java.io.*;

public class zamka {

  public static int sumOfDigits(int num) {
    int sum = 0;
    while (num != 0) {
      sum += (num % 10);
      num /= 10;
    }
    return sum;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int L = Integer.parseInt(br.readLine());
    int D = Integer.parseInt(br.readLine());
    int X = Integer.parseInt(br.readLine());

    for (int i = L; i <= D; i++) {
      if (sumOfDigits(i) == X) {
        System.out.println(i);
        break;
      }
    }

    for (int i = D; i >= L; i--) {
      if (sumOfDigits(i) == X) {
        System.out.println(i);
        break;
      }
    }
  }
}