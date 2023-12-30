import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no11479 {
    static int N;
    static int[] map;
    static boolean[] check;
    static ArrayList<ArrayList<Integer>> tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        tree = new ArrayList<>();
        N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) tree.add(new ArrayList<>());

        map = new int[N];
        check = new boolean[N];

        for(int i=0; i<N - 1; i++){
            st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken()) - 1;
            int n2 = Integer.parseInt(st.nextToken()) - 1;
            tree.get(n1).add(n2);
            tree.get(n2).add(n1);
        }

        bfs(0);
        for(int i=1; i<N; i++){
            System.out.println(map[i] + 1);
        }
    }

    private static void bfs(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        check[x] = true;

        while (!queue.isEmpty()){
            int cur = queue.poll();
            for(int node : tree.get(cur)){
                if(!check[node]){
                    check[node] = true;
                    queue.offer(node);
                    map[node] = cur;
                }
            }
        }
    }
}
