import java.io.*;

public class conundrum {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String text = br.readLine();

    int count = 0;
    for (int i = 0; i < text.length(); i += 3) {
      if (text.charAt(i) != 'P') {
        count++;
      }
      if (text.charAt(i + 1) != 'E') {
        count++;
      }
      if (text.charAt(i + 2) != 'R') {
        count++;
      }
    }
    System.out.println(count);
  }
}