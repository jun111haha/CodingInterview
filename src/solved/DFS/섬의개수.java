package solved.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
4963번
1 1
0
2 2
0 1
1 0
3 2
1 1 1
1 1 1
5 4
1 0 1 0 0
1 0 0 0 0
1 0 1 0 1
1 0 0 1 0
5 4
1 1 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 1 1
5 5
1 0 1 0 1
0 0 0 0 0
1 0 1 0 1
0 0 0 0 0
1 0 1 0 1
0 0
* */
public class 섬의개수 {
    static int W;
    static int H;

    //노드
    static int arr[][];
    //방문여부
    static boolean visit[][];
    //8방향
    static int[] dx = {0,1,1,1,0,-1,-1,-1};
    static int[] dy = {1,1,0,-1,-1,-1,0,1};
    //섬 갯수
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true) {
            st = new StringTokenizer(br.readLine());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());

            if(W ==0 && H == 0)
                break;

            arr = new int[H][W];
            visit = new boolean[H][W];
            cnt = 0 ;// 섬 갯수 초기화

            for(int i =0; i<H; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j =0; j<W; j++)
                    arr[i][j] = Integer.parseInt(st.nextToken());
            }//지도 입력

            for(int i =0; i<H; i++) {
                for(int j =0; j<W; j++) {
                    if(arr[i][j] == 1 && !visit[i][j]) {
                        System.out.println("현재 섬 시작 위치 ("+i+","+j+")");
                        visit[i][j] = true;
                        dfs(i,j);  //섬이면 DFS 섬찾기
                        cnt ++;
                    }
                }
            }
            System.out.println(cnt);

        }
    }
    public static void dfs(int x, int y){
        visit[x][y] = true;

        for(int i =0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && ny >= 0 && nx < H && ny < W){
                if(arr[nx][ny] == 1 && visit[nx][ny] == false){
                    dfs(nx, ny);
                }
            }
        }
    }
}
