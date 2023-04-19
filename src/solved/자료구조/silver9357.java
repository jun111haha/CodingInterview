package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//패션왕 신해빈
public class silver9357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<N; i++){
            int M = Integer.parseInt(br.readLine());
            HashMap<String, Integer> hashMap = new HashMap<>();
            for(int j=0; j<M; j++){
                StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
                stringTokenizer.nextToken();
                String temp = stringTokenizer.nextToken();
                hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
            }
            System.out.println(hashMap);
            int cnt = 1;
            for(Map.Entry<String,Integer> map : hashMap.entrySet()){
                cnt = cnt * (map.getValue() + 1);
            }
            stringBuilder.append(cnt - 1  + "\n");
        }

        System.out.println(stringBuilder);
    }
}
