package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치함수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        int [] arr = new int[testCase];

        for(int i =0; i<testCase; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int [] dp0 = new int[42];
        int [] dp1 = new int[42];

        dp0[0] = 1;
        dp0[1] = 0;
        dp1[0] = 0;
        dp1[1] = 1;

        for(int i =2; i<41; i++){
            dp0[i] = dp0[i - 1] + dp0[i - 2];
            dp1[i] = dp1[i - 1] + dp1[i - 2];

        }

        for(int i =0; i<testCase; i++){
            sb.append(dp0[arr[i]] + " " + dp1[arr[i]] + "\n");
        }

        System.out.println(sb);
    }
}
