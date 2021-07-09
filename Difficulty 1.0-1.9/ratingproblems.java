import java.io.*;
import java.util.*;
public class ratingproblems {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        double sum = 0;

        for(int i = 0; i < k; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        double min = (sum + ((n - k) * -3)) / n; 
        double max = (sum + ((n - k) * 3)) / n;

        System.out.println(min + " " + max);
    }
}