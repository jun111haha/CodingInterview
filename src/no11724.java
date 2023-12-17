import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no11724 {
    static int N, M;
    static int[][] arr;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][N + 1];
        visit = new boolean[N + 1];

        for(int j=0; j<M; j++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] = 1;
         }

        int cnt = 0;
        for(int i=1; i<=N; i++){
            if(!visit[i]){
                bfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        visit[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()){
            int temp = queue.poll();

            for(int i=1; i<=N; i++){
                if(arr[temp][i] == 1 && !visit[i]){
                    visit[i] = true;
                    queue.add(i);
                }
            }
        }

    }
}
