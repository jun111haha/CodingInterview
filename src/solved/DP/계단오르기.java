package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단오르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int [] arr = new int[tc + 1];
        int [] dp = new int[tc + 1];

        for(int i=1; i<=tc; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];
        if (tc >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        for(int i=3; i<=tc; i++){
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i];
        }

        System.out.println(dp[tc]);
    }
}
