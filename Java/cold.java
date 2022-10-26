import java.io.*;
import java.util.*;

public class cold {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();

    StringTokenizer st = new StringTokenizer(br.readLine());
    int totalColdDays = 0;

    while (st.hasMoreTokens()) {
      int temp = Integer.parseInt(st.nextToken());

      if (temp < 0) totalColdDays++;
    }

    System.out.println(totalColdDays);
  }
}