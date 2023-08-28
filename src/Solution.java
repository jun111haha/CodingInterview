import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int Red = 0;
        int Green = 1;
        int Blue = 2;
        int sum = 0;

        int[][] color = new int[N][3];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            color[i][Red] = Integer.parseInt(st.nextToken());
            color[i][Green] = Integer.parseInt(st.nextToken());
            color[i][Blue] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<N; i++){
            color[i][Red] += Math.min(color[i - 1][Green], color[i - 1][Blue]);
            color[i][Green] += Math.min(color[i - 1][Red], color[i - 1][Blue]);
            color[i][Blue] += Math.min(color[i - 1][Green], color[i - 1][Red]);
        }

        sum = Math.min(Math.min(color[N - 1][Red], color[N - 1][Green]), color[N - 1][Blue]);
        System.out.println(Arrays.deepToString(color));
    }
}
