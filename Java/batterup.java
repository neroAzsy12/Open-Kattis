import java.io.*;
import java.util.*;

public class batterup {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();

    double numerator = 0;
    double denominator = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    while (st.hasMoreTokens()) {
      int at_bat = Integer.parseInt(st.nextToken());

      if (at_bat > -1) {
        numerator += at_bat;
        denominator++;
      }
    }

    System.out.println(numerator / denominator);
  }
}