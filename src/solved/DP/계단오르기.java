package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 6
10
20
15
25
10
20
* */
public class 계단오르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int [] dp = new int[n + 1];
        int [] arr = new int[n + 1];

        //0은 시작점
        for(int i =1; i<=n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];

        // N 이 1이 입력되면 예외처리를 해줄 필요가 있다.
        if (n >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        //두칸전의 메모제이션 값과, 첫칸전 + 셋째칸전 의 메모제이션값중 큰값을 현재 i 계단 의 값과 합산하여 dp 에 저장
        for(int i =3; i<=n; i++){
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i];
        }
        System.out.println(dp[n]);
     }
}
