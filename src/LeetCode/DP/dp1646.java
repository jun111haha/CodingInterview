package LeetCode.DP;

//1646. Get Maximum in Generated Array
public class dp1646 {
    public static void main(String[] args) {

        System.out.println(getMaximumGenerated(7));
    }
    public static int getMaximumGenerated(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;

        int[] dp = new int[n + 1];
        int answer = 0;
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            if(i % 2 == 0){
                dp[i] = dp[i / 2];
            }else{
                dp[i] = dp[i / 2] + dp[i / 2 + 1];
            }

            answer = Math.max(dp[i], answer);
        }

        return answer;
    }
}
