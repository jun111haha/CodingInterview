import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){
            int n = Integer.parseInt(br.readLine());
            int[] dp = new int[n + 1];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            for(int j=4; j<=n; j++){
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }

            System.out.println(dp[n]);
        }

    }
}
