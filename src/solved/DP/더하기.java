package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
3
4
7
10
* */
public class 더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N];
        int [] dp = new int[11];
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //숫자 경우의수
        dp[1] = 1; // 1가지 (1)
        dp[2] = 2; // 2가지 (1+1, 2)
        dp[3] = 4; // 4가지 (1+1+1, 1+2, 2+1, 3)
        // dp[4] -> (1+1의 총케이스, 2+2의 총케이스, 3+3의 총케이스) = 7
        for(int i =0; i<arr.length; i++){
            for(int j =4; j<=arr[i]; j++){
                dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
            }
            sb.append(dp[arr[i]] + "\n");
        }
        System.out.println(sb);
    }
}
