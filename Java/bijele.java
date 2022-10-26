import java.io.*;
import java.util.*;

public class bijele {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int king = 1 - Integer.parseInt(st.nextToken());
    int queen = 1 - Integer.parseInt(st.nextToken()); 
    int rooks = 2 - Integer.parseInt(st.nextToken()); 
    int bishops = 2 - Integer.parseInt(st.nextToken()); 
    int knights = 2 - Integer.parseInt(st.nextToken()); 
    int pawns = 8 - Integer.parseInt(st.nextToken());

    System.out.printf("%d %d %d %d %d %d%n", king, queen, rooks, bishops, knights, pawns);
  }
}
