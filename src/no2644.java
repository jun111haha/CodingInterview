import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no2644 {
    static int[] dist;
    static int [][] arr;
    static int N, M, REL, tc;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        tc = Integer.parseInt(br.readLine());

        arr = new int[tc + 1][tc + 1];
        dist = new int[tc + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        REL = Integer.parseInt(br.readLine());

        for(int i=0; i<REL; i++){
            st =  new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }

        bfs(N);
        System.out.println(dist[M]);
    }

    private static void bfs(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);

        while (!queue.isEmpty()){
            int temp = queue.poll();

            if(temp == M) break;

            for(int i=1; i<=tc; i++){
                if(arr[temp][i] == 1 && dist[i] == 0){
                    queue.offer(i);
                    dist[i] = dist[temp] + 1;
                }
            }
        }
    }
}
