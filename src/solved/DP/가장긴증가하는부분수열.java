package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int [] arr = new int[tc + 1];
        int [] dp = new int[tc + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=1; i<=tc; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 1;
        for(int i=1; i<=tc; i++){
            int max = 0;
            for(int j=i-1; j>=0; j--){
                if(arr[i] > arr[j] && dp[j] > max){
                    max = dp[j];
                }
            }
            dp[i] = max + 1;
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}
