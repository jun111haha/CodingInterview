package solved.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 촌수계산 {
    static int count = -1; // relation count
    static int[][] arr;
    static boolean[] isChecked = new boolean[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(br.readLine()); // 총 사람
        StringTokenizer st = new StringTokenizer(br.readLine());
        int go = Integer.parseInt(st.nextToken()); // start
        int ed = Integer.parseInt(st.nextToken()); // end

        int r = Integer.parseInt(br.readLine()); // 관계

        arr = new int[101][101];

        for(int i =0; i<r; i++){
            st = new StringTokenizer(br.readLine());

            // 친척들과 관계
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            arr[n][m] = 1;
            arr[m][n] = 1;
        }

        dfs(go, ed, 0);

        System.out.println(count);
    }

    public static void dfs(int now, int end, int move){
        if (now == end) {
            count = move;
            return;
        }

        isChecked[now] = true;

        for (int i = 1; i <= 100; i++) {
            if (arr[now][i] == 1 && !isChecked[i]) {
                dfs(i, end, move + 1);
            }
        }

    }
}
