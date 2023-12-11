import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no7562 {
    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
    static int I;
    static int x1, y1, x2, y2;
    static int[][] arr;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=0; i<tc; i++){
            I = Integer.parseInt(br.readLine());
            arr = new int[I][I];
            visit = new boolean[I][I];

            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            BFS();
            sb.append(arr[x2][y2]).append("\n");
        }

        System.out.println(sb);//
    }

    private static void BFS(){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x1, y1});
        visit[x1][y1] = true;

        while (!queue.isEmpty()){
            int[] tempArr = queue.poll();
            int nx = tempArr[0];
            int ny = tempArr[1];

            for(int i=0; i<8; i++){
                int nowX = nx + dx[i];
                int nowY = ny + dy[i];
                if(nowX >= 0 && nowY >= 0 && nowX < I && nowY < I && !visit[nowX][nowY]){
                    queue.add(new int[]{nowX, nowY});
                    arr[nowX][nowY] = arr[nx][ny] + 1;
                    visit[nowX][nowY] = true;

                }
            }
        }
    }
}
