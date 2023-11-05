import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex {
    static int arr[][];
    static boolean visit[][];
    static int dirX[] = {-1, 0, 1, 0}; // 상 하 좌 우 대각선 상좌, 상우, 하좌, 하우
    static int dirY[] = {0, 1, 0, -1}; // 상 하 좌 우 대각선 상좌, 상우, 하좌, 하우

    static Queue<int[]> queue = new LinkedList<>();
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visit = new boolean[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int num = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                if(arr[i][j] == 0 || visit[i][j]) {
                    continue;
                }

                num++;
                visit[i][j] = true;
                queue.offer(new int[]{i, j});
                int area = 0;

                while (!queue.isEmpty()){
                    area++;
                    int[] temp = queue.poll();
                    int tempX = temp[0];
                    int tempY = temp[1];

                    for(int z=0; z<4; z++){
                        int nx = tempX + dirX[z];
                        int ny = tempY + dirY[z];

                        if (nx < 0 || ny < 0 || nx >= n || ny >= m){
                           continue;
                        }

                        if(visit[nx][ny] || arr[nx][ny] != 1){
                            continue;
                        }

                        visit[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                }

                max = Math.max(max, area);

            }
        }

        System.out.println(num);
        System.out.println(max);
    }

}
