package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//나는야 포켓몬 마스터 이다솜
public class silver1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> hashMap1 = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>();
        for(int i=1; i<=N; i++){
            String temp = br.readLine();
            hashMap1.put(temp, String.valueOf(i));
            hashMap2.put(String.valueOf(i), temp);
        }

        StringBuilder sb = new StringBuilder();
        for(int j=1; j<=M; j++){
            String inputTemp = br.readLine();
            String temp1 = hashMap1.get(inputTemp);
            String temp2 = hashMap2.get(inputTemp);

            if(temp1 != null){
                sb.append(temp1 + "\n");
            }else{
                sb.append(temp2 + "\n");
            }
        }

        System.out.println(sb);
    }
}
