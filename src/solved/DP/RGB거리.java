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
before [[26, 40, 83], [49, 60, 57], [13, 89, 99]]
after [[26, 40, 83], [89, 143, 83], [96, 172, 188]]
* */
public class RGB거리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int Red = 0;
        int Green = 1;
        int Blue = 2;

        int[][] color = new int[testCase][3];

        for(int i =0; i<testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            color[i][Red] = Integer.parseInt(st.nextToken());
            color[i][Green] = Integer.parseInt(st.nextToken());
            color[i][Blue] = Integer.parseInt(st.nextToken());
        }

        System.out.println("before " + Arrays.deepToString(color));
        for(int i =1; i<testCase; i++){
            color[i][Red] += Math.min(color[i - 1][Blue], color[i - 1][Green]);
            color[i][Green] += Math.min(color[i - 1][Blue], color[i  - 1][Blue]);
            color[i][Blue] += Math.min(color[i - 1][Red], color[i - 1][Red]);
        }

        int colorSum = Math.min(Math.min(color[testCase - 1][Red], color[testCase - 1][Green]), color[testCase - 1][Blue]);
        System.out.println("after " + Arrays.deepToString(color));
        System.out.println(colorSum);

    }
}
