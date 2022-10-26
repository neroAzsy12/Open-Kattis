import java.io.*;

public class twostones {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int turns = Integer.parseInt(br.readLine());
    
    if (turns % 2 != 0) {
      System.out.println("Alice");
    } else {
      System.out.println("Bob");
    }
  }
}