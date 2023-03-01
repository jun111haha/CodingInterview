package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 생태학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> hashMap = new HashMap<>();
        int all = 0;
        String temp = br.readLine();
        while (true){
            hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
            all++;

            temp = br.readLine();
            if (temp == null || temp.length() == 0) {
                break;
            }
        }

        List<String> keyList = new ArrayList<>(hashMap.keySet());
        keyList.sort(String :: compareTo);
        for (String key : keyList){
                int cnt = hashMap.get(key);
                double result = (double)(cnt * 100.0) / all;
                sb.append(key + " " + String.format("%.4f", result) + "\n");

        }
        System.out.println(sb);
    }
}
