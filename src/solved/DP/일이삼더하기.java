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
public class 일이삼더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        int [] dp = new int[11];
        int [] arr = new int[tc];
        for(int i=0; i<tc; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i=0; i<arr.length; i++){
            for(int j=4; j<=arr[i]; j++){
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }
            sb.append(dp[arr[i]] + "\n");
        }
        System.out.println(sb);
        //7
        //44
        //274
    }
}
