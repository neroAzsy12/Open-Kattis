import java.io.*;
import java.util.*;

public class boatparts {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int p = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());

    HashSet<String> parts = new HashSet<>();
    boolean allParts = false;

    for (int i = 1; i <= n; i++) {
      String w = br.readLine();
      parts.add(w);

      if (parts.size() == p) {
        System.out.println(i);
        allParts = true;
        break;
      }
    }

    if (!allParts) {
      System.out.println("paradox avoided");
    }
  }
}
