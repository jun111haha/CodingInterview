package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 돌게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int [] dp = new int[tc + 1];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        //dp [n]이 홀수면 상근이가 이기는 게임이고 dp [n]이 짝수면 창영이가 이긴다
        for(int i=4; i<=tc; i++){
            dp[i] = Math.min(dp[i - 1] , dp[i - 3]) + 1;
        }

        System.out.println(Arrays.toString(dp));
        if(dp[tc] % 2 == 0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }
    }
}
