package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 패션왕신해빈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){
            HashMap<String, Integer> hashMap = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            for(int j=0; j<N; j++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String key = st.nextToken();
                hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
            }
            int cnt = 1;
            for(Map.Entry<String, Integer> map : hashMap.entrySet()){
                cnt *= map.getValue() + 1;
            }
            System.out.println(cnt - 1);
        }
    }
}
