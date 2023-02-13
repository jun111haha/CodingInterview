package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 비밀번호찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> hashMap = new HashMap<>();
        for(int i=0 ;i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String key = st.nextToken();
            String value = st.nextToken();
            hashMap.put(key , value);
        }

        for(int i=0; i<M; i++){
            String key = br.readLine();
            sb.append(hashMap.get(key) + "\n");
        }

        System.out.println(sb);
    }
}
