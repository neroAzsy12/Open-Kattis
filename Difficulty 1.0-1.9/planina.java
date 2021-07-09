import java.io.*;
public class planina {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = (int)Math.pow(2, Integer.parseInt(br.readLine())) + 1;
        System.out.println((int)Math.pow(N, 2));
    }
}