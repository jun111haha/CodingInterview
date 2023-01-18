package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class 나는야포켓몬마스터이다솜 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedHashMap<String, String> hashMap1 = new LinkedHashMap<>();
        LinkedHashMap<String, String> hashMap2 = new LinkedHashMap<>();
        for(int i=1; i<=N; i++){
            String str = br.readLine();
            hashMap1.put(str, String.valueOf(i));
            hashMap2.put(String.valueOf(i), str);
        }

        for(int i=0; i<M; i++){
            String str = br.readLine();
            if(hashMap1.get(str) != null){
                sb.append(hashMap1.get(str) + "\n");
            }else{
                sb.append(hashMap2.get(str) + "\n");
            }
        }

        System.out.println(sb);
    }
}
