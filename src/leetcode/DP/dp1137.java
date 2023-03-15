package leetcode.DP;

public class dp1137 {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }
    public static int tribonacci(int n) {
        if(n == 0) return 0;
        if(n < 2){
            return 1;
        }

        int[] dp = new int[n + 1];
        int len = dp.length;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for(int i=3; i<len; i++){
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }
}
