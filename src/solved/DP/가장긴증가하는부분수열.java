package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
6
10 20 10 30 20 50
* */
public class 가장긴증가하는부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        int[] arr = new int[tc + 1];
        int[] dp = new int[tc + 1];

        dp[1] = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =1; i<=tc; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 1;
        for(int i =1; i<arr.length; i++){
            int max = 0;
            for(int j =i-1; j>=0; j--){
                if(arr[j] < arr[i] && dp[j] > max){
                    max = dp[j];
                }
            }
            dp[i] = max + 1;
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(answer);
    }
}
