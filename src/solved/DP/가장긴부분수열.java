package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n + 1];
        int [] dp = new int[n + 1];

        dp[0] = 1;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=1; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer =0;
        for(int i =1; i<arr.length; i++){
            int max = 0;
            for(int j =i-1; j>=0; j--){
                if(arr[j] < arr[i] && dp[j] > max);
            }
            dp[i] = max + 1;
            answer = Math.max(answer, dp[i]);
        }

        System.out.println(answer);
    }
}
