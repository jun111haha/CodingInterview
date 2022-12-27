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
        int tc = Integer.parseInt(br.readLine());
        int [][] arr = new int[tc][3];

        int RED = 0;
        int GREEN = 1;
        int BLUE = 2;

        for(int i=0; i<tc; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][RED] = Integer.parseInt(st.nextToken());
            arr[i][GREEN] = Integer.parseInt(st.nextToken());
            arr[i][BLUE] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<tc; i++){
            arr[i][RED] += Math.min(arr[i - 1][BLUE], arr[i - 1][GREEN]);
            arr[i][GREEN] += Math.min(arr[i - 1][BLUE], arr[i - 1][RED]);
            arr[i][BLUE] += Math.min(arr[i - 1][RED], arr[i - 1][GREEN]);
        }

        System.out.println(Arrays.deepToString(arr)); //[[26, 40, 83], [89, 86, 83], [96, 172, 185]]
        System.out.println(Math.min(Math.min(arr[tc - 1][RED], arr[tc - 1][GREEN]), arr[tc - 1][BLUE])); //96
    }
}
