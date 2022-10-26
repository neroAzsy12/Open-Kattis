import java.io.*;

public class alphabetspam {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double white = 0;
    double symbol = 0;
    double lower = 0;
    double upper = 0;
    
    String text = br.readLine();
    int text_length = text.length();
    
    for (int i = 0; i < text_length; i++) {
      char c = text.charAt(i);
      if (c == '_') {
        white++;
      } else if (c >= 97 && c <= 122){
        lower++;
      } else if (c >= 65 && c <= 90) {
        upper++;
      } else {
        symbol++;
      }
    }
    
    System.out.println(white/text_length);
    System.out.println(lower/text_length);
    System.out.println(upper/text_length);
    System.out.println(symbol/text_length);
  }
}