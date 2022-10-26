import java.io.*;

public class echoechoecho {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();

    System.out.println(word + " " + word + " " + word);
  }
}