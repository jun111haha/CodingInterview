import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no7562 {
    static int LEN;
    static int[][] map;
    static boolean[][] visited;
    static int[] dirX = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dirY = {2, 1, -1, -2, -2, -1, 1, 2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int tc = Integer.parseInt(br.readLine());
        for(int i=0; i<tc ; i++){
            LEN = Integer.parseInt(br.readLine());
            visited = new boolean[LEN][LEN];
            map = new int[LEN][LEN];

            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            bfs(x1, y1);
            System.out.println(map[x2][y2]);
        }
    }

    private static void bfs(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()){
            Point point = queue.poll();
            int nx = point.x;
            int ny = point.y;
            for(int i=0; i<8; i++){
                int nowX = nx + dirX[i];
                int noxY = ny + dirY[i];

                if(nowX >= 0 && noxY >= 0 && nowX < LEN && noxY < LEN && !visited[nowX][noxY]){
                    queue.offer(new Point(nowX, noxY));
                    map[nowX][noxY] = map[nx][ny] + 1;
                    visited[nowX][noxY] = true;
                }
            }
        }
    }
}
