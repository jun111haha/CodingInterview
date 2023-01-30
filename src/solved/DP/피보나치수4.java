package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 피보나치수4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        if(tc == 0){
            System.out.println(0);
        }else if(tc == 1){
            System.out.println(1);
        }else{
            BigInteger[] dp  = new BigInteger[tc + 1];
            dp[1] = BigInteger.ONE;
            dp[2] = BigInteger.ONE;

            for(int i=3; i<=tc; i++){
                dp[i] = dp[i - 1].add(dp[i - 2]);
            }

            sb.append(dp[tc]);
        }

        System.out.println(sb);
    }
}
