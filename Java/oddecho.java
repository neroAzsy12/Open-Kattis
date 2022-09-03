import java.io.*;

// N, number of lines
// Output: print odd-indexed words from input
public class oddecho {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numOfWords = Integer.parseInt(br.readLine());
    for (int i = 1; i <= numOfWords; i++) {
      String word = br.readLine();

      if (i % 2 == 0) continue;
      System.out.println(word);
    }
  }
}