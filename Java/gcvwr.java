import java.io.*;
import java.util.*;

public class gcvwr {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int g = Integer.parseInt(st.nextToken());
    int t = Integer.parseInt(st.nextToken());
    // int n = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int total_weight_items = 0;

    while (st.hasMoreTokens()) {
      total_weight_items += Integer.parseInt(st.nextToken());
    }

    int trailer_weight = g - t;
    trailer_weight = (int)(trailer_weight * 0.9) - total_weight_items;

    System.out.println(trailer_weight);
  }
}
