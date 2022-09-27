package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 숫자카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int test_case = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()){
            int n = Integer.parseInt(st.nextToken());
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }

        int test_case2 = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        while (st2.hasMoreTokens()){
            int m = Integer.parseInt(st2.nextToken());
            if(hashMap.get(m) == null){
                sb.append(0).append(" ");
            }else{
                sb.append(1).append(" ");
            }
        }
        System.out.println(sb);

    }
}
