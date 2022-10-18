import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] check;
    static int[][] arr;
    static  StringBuilder sb = new StringBuilder();

    static int node, line, start;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        arr = new int[node + 1][node +1];
        check = new boolean[node + 1];

        for(int i =0; i<line; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] =  1;
        }
        dfs(start);
        System.out.println(sb);

    }

    public static void dfs(int start){
        check[start] = true;
        sb.append(start + " ");

        for(int i =1; i<=node; i++){
            if(arr[start][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }
}
