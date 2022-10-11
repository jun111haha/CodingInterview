package solved.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 유기농배추 {

    static int N;
    static int M;
    static int location;
    //노드
    static int arr[][];
    //방문여부
    static boolean visit[][];
    //상하좌우 좌표
    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};
    static int nowX, nowY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int tc =0; tc<testCase; tc++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            N = Integer.parseInt(str.nextToken()); //배추밭 가로길이
            M = Integer.parseInt(str.nextToken()); //배추밭 세로길이
            location = Integer.parseInt(str.nextToken()); //배추가 심어져 있는 위치의 개수

            arr = new int[N][M]; //배추밭
            visit = new boolean[N][M]; //방문여부

            //배추밭에 배추 입력
            for(int i =0; i<location; i++){
                StringTokenizer str1 = new StringTokenizer(br.readLine());
                int lc1 = Integer.parseInt(str1.nextToken());
                int lc2 = Integer.parseInt(str1.nextToken());
                arr[lc1][lc2] = 1;
            }

            int cnt = 0; //구역수

            for(int i =0; i<N; i++){
                for(int j =0; j<M; j++){
                    //배추가 있으면서 방문하지 않았다면 dfs 탐색하고 구역수 1증가.
                    if(arr[i][j] == 1 && !visit[i][j]){
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    public static void dfs(int x, int y){
        visit[x][y] = true;

        for(int i =0; i<4; i++){
            nowX = dirX[i] + x;
            nowY = dirY[i] + y;

            if(nowX >= 0 && nowY >= 0 && nowX < N && nowY < M){
                if(arr[nowX][nowY] == 1 && !visit[nowX][nowY]){
                    dfs(nowX, nowY);
                }
            }
        }
    }
}
