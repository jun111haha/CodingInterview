import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N];
        int [] dp = new int[11];
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i =0; i<arr.length; i++){
            for(int j =4; j<=arr[i]; j++){
                dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
            }
            sb.append(dp[arr[i]] + "\n");
        }
        System.out.println(sb);
    }
}
