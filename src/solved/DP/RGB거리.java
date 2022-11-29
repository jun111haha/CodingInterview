package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
3
26 40 83
49 60 57
13 89 99
* */
public class RGB거리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int Red = 0;
        int Green = 1;
        int Blue = 2;
        int colorSum =0;

        int[][] color = new int[N][3];

        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            color[i][Red] = Integer.parseInt(st.nextToken());
            color[i][Green] = Integer.parseInt(st.nextToken());
            color[i][Blue] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.deepToString(color));
        // [[26, 40, 83], [49, 60, 57], [13, 89, 99]]

        for(int i =1; i<N; i++){
            color[i][Red] += Math.min(color[i - 1][Green], color[i - 1][Blue]);
            color[i][Green] += Math.min(color[i - 1][Red], color[i - 1][Blue]);
            color[i][Blue] += Math.min(color[i - 1][Green], color[i - 1][Red]);

        }

        System.out.println(Arrays.deepToString(color));
        // [[26, 40, 83], [89, 86, 83], [96, 172, 185]]

        colorSum = Math.min(Math.min(color[N - 1][Red], color[N - 1][Green]), color[N - 1][Blue]);
        System.out.println(colorSum);
    }
}
