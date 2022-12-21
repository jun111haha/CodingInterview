package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
10
10 -4 3 1 5 6 -35 12 21 -1
* */
public class 연속합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        int [] arr = new int[tc + 1];
        int [] dp = new int[tc + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =1; i<=tc; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = arr[1];
        int max = arr[1];

        for(int i =2; i<=tc; i++){
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            max = Math.max(max , dp[i]);
        }

        System.out.println(Arrays.toString(dp));
        // [0, 10, 6, 9, 10, 15, 21, -14, 12, 33, 32]
        System.out.println(max);
    }
}
