import java.util.HashMap;
import java.io.*;

// Input consists of up to 1000 lines of text, ending at end of file. 
// Each line is at most 100 characters long.
public class printingcosts {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String line; 

    HashMap<Character, Integer> values = new HashMap<Character, Integer>(); 
    values.put(' ', 0);
    values.put('&', 24);
    values.put(',', 7);
    values.put('2', 22);
    values.put('8', 23);
    values.put('>', 10);
    values.put('D', 26);
    values.put('J', 18);
    values.put('P', 23);
    values.put('V', 19);
    values.put('\\', 10);
    values.put('b', 25);
    values.put('h', 21);
    values.put('n', 18);
    values.put('t', 17);
    values.put('z', 19);
    values.put('!', 9);
    values.put('\'', 3);
    values.put('-', 7);
    values.put('3', 23);
    values.put('9', 26);
    values.put('?', 15);
    values.put('E', 26);
    values.put('K', 21);
    values.put('Q', 31);
    values.put('W', 26);
    values.put(']', 18);
    values.put('c', 17);
    values.put('i', 15);
    values.put('o', 20);
    values.put('u', 17);
    values.put('{', 18);
    values.put('"', 6);
    values.put('(', 12);
    values.put('.', 4);
    values.put('4', 21);
    values.put(':', 8);
    values.put('@', 32);
    values.put('F', 20);
    values.put('L', 16);
    values.put('R', 28);
    values.put('X', 18);
    values.put('^', 7);
    values.put('d', 25);
    values.put('j', 20);
    values.put('p', 25);
    values.put('v', 13);
    values.put('|', 12);
    values.put('#', 24);
    values.put(')', 12);
    values.put('/', 10);
    values.put('5', 27);
    values.put(';', 11);
    values.put('A', 24);
    values.put('G', 25);
    values.put('M', 28);
    values.put('S', 25);
    values.put('Y', 14);
    values.put('_', 8);
    values.put('e', 23);
    values.put('k', 21);
    values.put('q', 25);
    values.put('w', 19);
    values.put('}', 18);
    values.put('$', 29);
    values.put('*', 17);
    values.put('0', 22);
    values.put('6', 26);
    values.put('<', 10);
    values.put('B', 29);
    values.put('H', 25);
    values.put('N', 25);
    values.put('T', 16);
    values.put('Z', 22);
    values.put('`', 3);
    values.put('f', 18);
    values.put('l', 16);
    values.put('r', 13);
    values.put('x', 13);
    values.put('~', 9);
    values.put('%', 22);
    values.put('+', 13);
    values.put('1', 19);
    values.put('7', 16);
    values.put('=', 14);
    values.put('C', 20);
    values.put('I', 18);
    values.put('O', 26);
    values.put('U', 23);
    values.put('[', 18);
    values.put('a', 23);
    values.put('g', 30);
    values.put('m', 22);
    values.put('s', 21);
    values.put('y', 24);

    while((line = in.readLine()) != null) {
        int cost = 0; 
        for(int i = 0; i < line.length(); i++) {
            cost += values.get(line.charAt(i));
        }
        System.out.println(cost); 
    }
  }
}