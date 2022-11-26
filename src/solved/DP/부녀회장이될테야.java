package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부녀회장이될테야 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] APT = new int[15][15];
        for(int i =0; i<15; i++){
            APT[i][1] = 1;	// i층 1호
            APT[0][i] = i;	// 0층 i호
        }

        for(int i=1; i<15; i++){
            for(int j=2; j<15; j++){
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
            }
        }

        for(int i=0; i<n; i++){
            int k = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());
            System.out.println(APT[k][m]);
        }
    }
}
