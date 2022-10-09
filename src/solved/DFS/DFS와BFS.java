package solved.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/*
4 5 1
1 2
1 3
1 4
2 4
3 4
* */
public class DFS와BFS {
    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] arr;

    static int node, line, start;

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        arr = new int[node + 1][node + 1];
        check = new boolean[node + 1];

        for(int i =0; i<line; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] =  1;
        }
        dfs(start);
        sb.append("\n");
        check = new boolean[node+1];

        bfs(start);
        System.out.println(sb);

    }

    public static void dfs(int start){
        //현재 노드를 방문처리
        check[start] = true;
        //방문한 노드를 출력
        sb.append(start + " ");

        for(int i =0; i <=node; i++){
            //탐색하지않은 노드
            if(arr[start][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int start){
        q.add(start);
        check[start] = true;
        while(!q.isEmpty()){
            start = q.poll();
            sb.append(start + " ");

            for(int i =1; i<=node; i++){
                //간선이 있고 탐색하지않은 노드
                if(arr[start][i] == 1 && !check[i]){
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }
}
