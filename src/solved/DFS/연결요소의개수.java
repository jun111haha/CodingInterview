package solved.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
11724번
6 8
1 2
2 5
5 1
3 4
4 6
5 4
2 4
2 3
* */
public class 연결요소의개수 {
    static int N;
    static int M;

    //노드
    static int arr[][];
    //방문여부
    static boolean visit[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        N = Integer.parseInt(str.nextToken());
        M = Integer.parseInt(str.nextToken());

        arr = new int[N + 1][N + 1];
        visit = new boolean[N + 1];
        for(int i =0; i<M; i++){
            StringTokenizer str1 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(str1.nextToken());
            int y = Integer.parseInt(str1.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }

        int cnt = 0;
        for(int i =1; i<=N; i++){
            if(visit[i] == false){
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int start){
        visit[start] = true;

        for(int i =1; i<=N; i++){
            if(arr[start][i] == 1 && visit[i] == false){
                dfs(i);
            }
        }
    }
}
