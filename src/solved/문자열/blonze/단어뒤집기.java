package solved.문자열.blonze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단어뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while (st.hasMoreTokens()){
                StringBuffer sb2 = new StringBuffer(st.nextToken());
                sb.append(sb2.reverse().toString() + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
