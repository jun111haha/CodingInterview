import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class no2178 {
    static int N, M;
    static int[][] map;
    static boolean[][] check;
    static int[] dirX = {-1, 0, 1, 0}; // 상 하 좌 우
    static int[] dirY = {0, 1, 0, -1}; // 상 하 좌 우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        check = new boolean[N][M];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == '1'){
                    map[i][j] = 1;
                }
            }
        }

        bfs(0, 0);
        System.out.println(map[N - 1][M - 1]);
    }

    private static void bfs(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        check[x][y] = true;
        queue.offer(new Point(x, y));

        while (!queue.isEmpty()){
            Point p = queue.poll();
            int nx = p.x;
            int ny = p.y;

            for(int i=0; i<4; i++){
                int nowX = nx + dirX[i];
                int nowY = ny + dirY[i];

                if(nowX >= 0 && nowY >= 0 && nowX < N && nowY < M
                && map[nowX][nowY] == 1 && !check[nowX][nowY]){

                    queue.offer(new Point(nowX, nowY));
                    check[nowX][nowY] = true;
                    map[nowX][nowY] = map[nx][ny] + 1;
                }
            }
        }
    }
}
