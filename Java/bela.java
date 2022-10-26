import java.io.*;
import java.util.*;

public class bela {
  
  public static int getVal(char num, boolean isDominate) {
    switch (num) {
      case 'A':
        return 11;
      case 'K':
        return 4;
      case 'Q':
        return 3;
      case 'J':
        return (isDominate ? 20 : 2);
      case 'T':
        return 10;
      case '9':
        return (isDominate ? 14 : 0);
      default:
        return 0;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int hands = Integer.parseInt(st.nextToken());
    char trump_suit = st.nextToken().charAt(0);

    int sum = 0;

    for (int i = 0; i < 4 * hands; i++) {
      String card = br.readLine();

      boolean isTrump = (card.charAt(1) == trump_suit ? true : false);
      sum += getVal(card.charAt(0), isTrump);
    }

    System.out.println(sum);
  }
}
