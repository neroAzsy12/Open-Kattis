import java.io.*;
import java.util.*;

public class faktor {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(st.nextToken());
    int i = Integer.parseInt(st.nextToken());

    System.out.println((a * i) - (a - 1));
  }
}