import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [][] arr;
    static boolean [] isCheck;
    static int cnt = 0;
    static int com = 0;
    static int line = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        com = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());

        isCheck = new boolean[com +1];
        arr = new int[com +1][com +1];

        for(int i =0; i<line; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        dfs(1);
        System.out.println(cnt - 1);
    }

    public static void dfs(int start){
        isCheck[start] = true;
        cnt ++;

        for(int i =0; i<=com; i++){
            if(isCheck[i] == false && arr[start][i] == 1){
                dfs(i);
            }

        }

    }
}
