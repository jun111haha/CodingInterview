package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 가장긴부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        int [] dp = new int[n];

        dp[0] = 1;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer =1; // 반례중에 수열이 하나만 들어올경우 for 문을 안탐 1로 초기화 해줘야함.
        for(int i =1; i<arr.length; i++){
            int max = 0;
            //i 전 까지 도는 반복문
            for(int j =i-1; j>=0; j--){
                // j번째 원소가 i번째 원소보다 작으면서 i번째 dp가 max 보다 큰경우
                if(arr[j] < arr[i] && dp[j] > max){
                    //dy[j] 의 최대길이의 값
                    max = dp[j];
                }
            }
            //if 문을 안타면 앞에 항이 없다는 뜻 max=0 이니까 +1 해줘서 다이나믹값을 1로 유지
            dp[i] = max + 1;
            answer = Math.max(answer, dp[i]);
        }

        /*
        dp[0] = {10} : 길이 1
        dp[1] = {10, 20} : 길이 2
        dp[2] = {10} : 길이 1
        dp[3] = {10, 20, 30} : 길이 3
        dp[4] = {10, 20} : 길이 2
        dp[5] = {10, 20, 30, 50} : 길이 4
        * */
        System.out.println(Arrays.toString(dp));
        System.out.println(answer);
    }
}
