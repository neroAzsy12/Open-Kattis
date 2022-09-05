import java.io.*;
import java.util.*;

public class modulo {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashSet<Integer> distinctValues = new HashSet<>();

    for (int i = 0; i < 10; i++) {
      int val = Integer.parseInt(br.readLine());
      distinctValues.add(val % 42);
    }

    System.out.println(distinctValues.size());
  }
}