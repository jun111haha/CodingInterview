package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 문자열집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=0; i<N; i++){
            String temp = br.readLine();
            hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
        }

        int cnt = 0;
        for(int i=0; i<M; i++){
            String temp = br.readLine();
            if(hashMap.containsKey(temp)){
                cnt += hashMap.get(temp);
            }
        }
        System.out.println(cnt);
    }
}
