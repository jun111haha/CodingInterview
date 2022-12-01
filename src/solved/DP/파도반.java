package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 파도반 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        long [] dp = new long[101];

        dp[1] = 1;
        dp[2] = 1;
        for(int i =0; i<n; i++){
            int m = Integer.parseInt(br.readLine());
            for(int j =3; j<=m; j++){
                dp[j] = dp[j - 2] + dp[j - 3];
            }
            sb.append(dp[m] + "\n");
        }
        System.out.println(sb);
    }
}
