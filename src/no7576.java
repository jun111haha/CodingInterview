import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no7576 {
    static int arr[][];
    static boolean visit[][];
    static int dirX[] = {-1, 0, 1, 0}; // 상 하 좌 우
    static int dirY[] = {0, 1, 0, -1}; // 상 하 좌 우

    static int n, m;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visit = new boolean[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    queue.offer(new int[]{i, j});
                }

            }
        }

        System.out.println(bfs());
    }

    private static int bfs(){
        while (!queue.isEmpty()){
            int[] temp = queue.poll();
            int tempX = temp[0];
            int tempY = temp[1];

            for(int i=0; i<4; i++){
                int nx = tempX + dirX[i];
                int ny = tempY + dirY[i];
                if(0 > nx || nx >=n || ny < 0 || ny >=m){
                    continue;
                }

                if(arr[nx][ny] == 0){
                    arr[nx][ny] = arr[tempX][tempY] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }

        int max = Integer.MIN_VALUE;
        if(check()){
            return -1;
        }else{
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(max < arr[i][j]){
                        max = arr[i][j];
                    }
                }
            }
        }

        return max - 1;
    }

    private static boolean check() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0)
                    return true;
            }
        }
        return false;
    }


}
