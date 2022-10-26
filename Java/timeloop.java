import java.io.*;

public class timeloop {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int times = Integer.parseInt(br.readLine());

    for (int i = 1; i <= times; i++) {
      System.out.println(i + " Abracadabra");
    }
  }
}