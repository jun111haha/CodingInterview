package solved.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
7
0110100
0110101
1110101
0000111
0100000
0111110
0111000
* */
public class 단지번호붙이기 {
    static StringBuilder sb = new StringBuilder();
    //노드
    static int arr[][];
    //방문여부
    static boolean visit[][];
    //상하좌우 좌표
    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};
    static int cnt = 0;
    //단지번호 부여
    static int number = 0;
    //범위를 계산한 좌표
    static int nowX, nowY;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visit = new boolean[N][N];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                arr[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(visit[i][j] == false && arr[i][j] == 1) {
                    cnt = 0;
                    number++;
                    dfs(i, j);
                    list.add(cnt);
                }
            }
        }

        Collections.sort(list);
        sb.append(number).append("\n");
        for(int num : list){
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int x, int y){
        visit[x][y] = true;
        arr[x][y] = number;
        cnt ++;

        for(int i=0; i<4; i++){
            nowX = dirX[i] + x;
            nowY = dirY[i] + y;

            if(nowX >= 0 && nowY >= 0 && nowX < N && nowY < N){
                if(visit[nowX][nowY] == false && arr[nowX][nowY] == 1){
                    visit[nowX][nowY] = true;
                    arr[nowX][nowY] = number;

                    dfs(nowX, nowY);
                }
            }
        }
    }
}
