package solved.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
8 8
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBBBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW
* */
public class 체스판다시칠하기 {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new boolean[n][m];

        for(int i =0; i<n; i++){
            String str = br.readLine();
            for(int j =0; j<m; j++){
                if(str.charAt(j) == 'W'){
                    arr[i][j] = true;
                }else{
                    arr[i][j] = false;
                }
            }
        }

        int n_row = n - 7;
        int m_col = m - 7;
        for(int i =0; i<n_row; i++){
            for(int j =0; j<m_col; j++){
                find(i, j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y){
        int end_x = x + 8;
        int end_y = y + 8;
        int cnt = 0;

        boolean TF = arr[x][y];

        for(int i =x; i<end_x; i++){
            for(int j =y; j<end_y; j++){
                if(arr[i][j] != TF){
                    cnt++;
                }

                /*
                 * 다음 칸은 색이 바뀌므로
                 * true라면 false로, false 라면 true 로
                 * 값을 변경한다.
                 */

                TF = (!TF);
            }
            TF = !TF;
        }

        /*
         *  첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
         *  첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
         *  색칠 할 개수(64 - count) 중 최솟값을 count 에 저장
         */
        cnt = Math.min(cnt, 64 - cnt);

        /*
         * 이전까지의 경우 중 최솟값보다 현재 count 값이
         * 더 작을 경우 최솟값을 갱신
         */
        min = Math.min(min, cnt);
    }

}
