import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
    static int arr[][];
    static boolean visit[][];
    static int dirX[] = {-1, 0, 1, 0}; // 상 하 좌 우 대각선 상좌, 상우, 하좌, 하우
    static int dirY[] = {0, 1, 0, -1}; // 상 하 좌 우 대각선 상좌, 상우, 하좌, 하우
    static int n, m;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visit = new boolean[n][m];

        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                queue.add(new int[]{0, 0});

                while (!queue.isEmpty()){
                    int[] temp = queue.poll();
                    int x = temp[0];
                    int y = temp[1];

                    for(int dir=0; dir<4; dir++){
                        int nx = x + dirX[dir];
                        int ny = y + dirY[dir];

                        if(nx < 0 || nx >=n || ny < 0 || ny >= m){
                            continue;
                        }

                        if(visit[nx][ny] || arr[nx][ny] != 1){
                            continue;
                        }

                        queue.offer(new int[]{nx, ny});
                        visit[nx][ny] = true;
                        arr[nx][ny] = arr[x][y] + 1;

                    }
                }
            }
        }

        System.out.println(arr[n - 1][m - 1]);
    }
}
