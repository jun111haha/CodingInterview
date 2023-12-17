import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node1 {
    int x;
    int y;

    Node1(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class no1012 {
    static int N, M, K;
    static boolean[][] check;
    static int [][] arr;
    static int[] dirX = {-1, 0, 1, 0}; // 상 하 좌 우
    static int[] dirY = {0, 1, 0, -1}; // 상 하 좌 우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=0; i<tc; i++){
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            arr = new int[N][M];
            check = new boolean[N][M];

            for(int j = 0; j< K; j++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[b][a] = 1;
            }

            int cnt = 0;
            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    if(!check[j][k] && arr[j][k] == 1){
                        bfs(j, k);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    private static void bfs(int x, int y){
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x , y));
        check[x][y] = true;

        while (!queue.isEmpty()){
            Node node = queue.poll();
            int nx = node.x;
            int ny = node.y;

            for(int i=0; i<4; i++){
                int nowX = nx + dirX[i];
                int nowY = ny + dirY[i];

                if(nowX >= 0 && nowY >= 0 && nowX < N && nowY < M
                    && arr[nowX][nowY] == 1 && !check[nowX][nowY]){

                    queue.offer(new Node(nowX, nowY));
                    check[nowX][nowY] = true;
                }

            }
        }

    }
}
