import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dirX = {0, 0, -1 ,1, -1, 1, -1, 1};
    static int[] dirY = {-1, 1, 0, 0, 1, 1, -1, -1};

    static int[][] arr;
    static boolean[][] visit;

    static int n, m;
    static class Node{
        int x;
        int y;

        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str = "";
        while (!(str = br.readLine()).equals("0 0")){
            st = new StringTokenizer(str);

            n = Integer.parseInt(st.nextToken()); // 너비
            m = Integer.parseInt(st.nextToken()); // 높이
            arr = new int[m][n];
            visit = new boolean[m][n];

            for(int i=0; i<m; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(!visit[i][j] && arr[i][j] == 1){
                        bfs(i ,j);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }

    }


    private static void bfs(int x, int y){
        Queue<Node> queue = new LinkedList<>();
        visit[x][y] = true;
        queue.offer(new Node(x, y));

        while (!queue.isEmpty()){
            Node node = queue.poll();
            int nx = node.x;
            int ny = node.y;

            for(int i=0; i<8; i++){
                int nowX = nx + dirX[i];
                int nowY = ny + dirY[i];

                if(nowX >= 0 && nowY >= 0 && nowX < m && nowY < n
                && !visit[nowX][nowY] && arr[nowX][nowY] == 1){

                    visit[nowX][nowY] = true;
                    queue.offer(new Node(nowX, nowY));

                }

            }


        }

    }
}
