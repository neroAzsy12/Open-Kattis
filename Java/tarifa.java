import java.io.*;

public class tarifa {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());

    int total = x;

    for (int i = 0; i < n; i++) {
      int p = Integer.parseInt(br.readLine());
      total += (x - p);
    }

    System.out.println(total);
  }
}
