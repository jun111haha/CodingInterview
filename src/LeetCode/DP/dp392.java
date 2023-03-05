package LeetCode.DP;

import java.util.Arrays;

public class dp392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc" , "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        int[][] dp = new int[sLen + 1][tLen + 1];
        for(int i=1; i<sLen+1; i++){
            for(int j=1; j<tLen+1; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(Arrays.deepToString(dp));
        return s.length() == dp[sLen][tLen];
    }
}
