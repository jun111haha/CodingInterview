package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 패션왕신해빈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int testCase = Integer.parseInt(br.readLine());
        for(int i =0; i<testCase; i++){
            int n = Integer.parseInt(br.readLine());
            HashMap<String , Integer> hashMap = new HashMap<>();

            for(int j=0; j<n; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String key = st.nextToken();
                hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
            }
            int cnt = 1;
            for(Map.Entry<String,Integer> entry : hashMap.entrySet()){
                cnt = cnt * (entry.getValue() + 1);
            }
            sb.append(cnt -1 + "\n");
        }
        System.out.println(sb);
    }
}
