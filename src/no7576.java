import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no7576 {

    static class tomato{
        int x;
        int y;
        int day;

        public tomato(int x, int y, int day){
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

    static int[][] arr;
    static int dirX[] = {-1, 0, 1, 0}; // 상 하 좌 우 대각선 상좌, 상우, 하좌, 하우
    static int dirY[] = {0, 1, 0, -1}; // 상 하 좌 우 대각선 상좌, 상우, 하좌, 하우
    static int n, m;
    static Queue<tomato> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    queue.offer(new tomato(i,j,0));
                }
            }
        }

        bfs();
    }

    public static void bfs(){
        int day = 0;

        while (!queue.isEmpty()){
            tomato t = queue.poll();
            day = t.day;

            for(int i=0; i<4; i++){
                int nx = t.x + dirX[i];
                int ny = t.y + dirY[i];

                if(0 <= nx && nx < n && 0 <= ny && ny < m){
                    if(arr[nx][ny] == 0){
                        arr[nx][ny] = 1;
                        queue.add(new tomato(nx, ny , day + 1));
                    }
                }
            }
        }

        if(checkTomato()){
            System.out.println(day);
        }else{
            System.out.println(-1);
        }
    }

    static boolean checkTomato() {
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i][j] == 0)
                    return false;
                // 덜 익은 토마토가 있다면
            }
        }
        return true;
    }
}
