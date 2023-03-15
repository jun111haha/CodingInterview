package leetcode.DP;

import java.util.Arrays;

public class dp338 {
    public static void main(String[] args) {
        System.out.println(countBits(5));
    }

    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        for(int i=1; i<=n; i++){
            dp[i] = Integer.bitCount(i);
        }

        System.out.println(Arrays.toString(dp));
        return dp;
    }
}
