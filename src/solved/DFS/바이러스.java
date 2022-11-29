package solved.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바이러스 {
    static int[][] arr;
    static boolean[] check;
    static int com;
    static int cnt;
    static int line;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        com = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());

        check = new boolean[com +1];
        arr = new int[com +1][com +1];

        for(int i =0; i<line; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] =  1;
        }

        dfs(1);
        System.out.println(cnt - 1);
    }

    public static void dfs(int start) {
        check[start] = true;
        cnt ++;

        for(int i = 0; i<= com; i++){
            if(arr[start][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }
}
