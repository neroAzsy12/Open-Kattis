import java.util.*;
import java.io.*;

public class costumecontest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        TreeMap<String, Integer> costumes = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String costume = br.readLine();

            costumes.put(costume, costumes.containsKey(costume) ? costumes.get(costume) + 1 : 1);
        }

        int min = 1000;
        for (String key : costumes.keySet()) {
            min = Math.min(min, costumes.get(key));
        }

        for (String costume : costumes.keySet()) {
            if (costumes.get(costume) == min) {
                System.out.println(costume);
            }
        }
    }
}