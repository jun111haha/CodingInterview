package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class 학생인기도측정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        while (st1.hasMoreTokens()){
            String temp = st1.nextToken();
            hashMap.put(temp, hashMap.getOrDefault(temp, 0));
        }

        for(int i=0; i<tc; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " " );
            while (st2.hasMoreTokens()){
                String temp = st2.nextToken();
                hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
            }
        }


    }
}
