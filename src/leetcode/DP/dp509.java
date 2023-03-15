package leetcode.DP;

public class dp509 {
    public static void main(String[] args) {
        System.out.println(fib(2));
    }

    public static int fib(int n) {
        if(n < 2){
            return n;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n - 1];
    }
}
