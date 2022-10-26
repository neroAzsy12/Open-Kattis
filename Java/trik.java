import java.io.*;

public class trik {
  public static void swap(boolean[] ball, int a, int b) {
    boolean tmp = ball[a];
    ball[a] = ball[b];
    ball[b] = tmp;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean[] ball = {true, false, false};

    String moves = br.readLine();

    for (int i = 0; i < moves.length(); i++) {
      if (moves.charAt(i) == 'A') {
        swap(ball, 0, 1);
      }
      if (moves.charAt(i) == 'B') {
        swap(ball, 1, 2);
      }
      if (moves.charAt(i) == 'C') {
        swap(ball, 0, 2);
      }
    }

    if (ball[0]) {
      System.out.println(1);
    }
    if (ball[1]) {
      System.out.println(2);
    }
    if (ball[2]) {
      System.out.println(3);
    }
  }
}
