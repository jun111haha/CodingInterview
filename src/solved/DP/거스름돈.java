package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int[] dp = new int[100001];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[2] = 1; // 2원 1개
        dp[5] = 1; // 5원 1개
        dp[4] = 2; // 4원 -> 2원짜리 2개 반복문 6부터 돌기위해서 배열 4도 지정.

        for(int i=6; i<=tc; i++){
            dp[i] = Math.min(dp[i - 2], dp[i - 5]) + 1;
        }
        System.out.println(dp[tc]);
    }
}
