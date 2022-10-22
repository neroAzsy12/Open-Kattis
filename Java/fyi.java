import java.io.*;

public class fyi {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(br.readLine());

    if (number > 5549999 && number < 5560000) {
        System.out.println(1);
    } else {
        System.out.println(0);
    }
  }
}