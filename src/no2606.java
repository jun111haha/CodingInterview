import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no2606 {
    static boolean[] check;
    static int [][] arr;

    static int com, line, cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        com = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());

        arr = new int[com + 1][com + 1];
        check = new boolean[com + 1];

        for(int i=0; i<line; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            arr[n][m] = arr[m][n] = 1;
        }

        bfs(1);
        System.out.println(cnt);
    }

    public static void bfs(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        check[x] = true;

        while (!queue.isEmpty()){
            int temp = queue.poll();

            for(int i=1; i<=com; i++){
                if(arr[temp][i] == 1 && !check[i]){
                    queue.offer(i);
                    check[i] = true;
                    cnt++;
                }
            }
        }
    }

}
