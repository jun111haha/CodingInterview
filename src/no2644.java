import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no2644 {
    static int N, M;
    static int[][] graph;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[tc + 1][tc + 1];
        dist = new int[tc + 1];

        int K = Integer.parseInt(br.readLine());
        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = 1;
        }


        bfs(N);
        System.out.println(dist[M]);
        System.out.println(Arrays.deepToString(graph));
    }

    public static void bfs(int index){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(index);

        while (!queue.isEmpty()){
            int temp = queue.poll();

            if(temp == M) break;

            for(int i=1; i<=N; i++){
                if(graph[temp][i] == 1 && dist[i] == 0){
                    queue.add(i);
                    dist[i] = dist[temp] + 1;
                }
            }

        }
    }
}
