import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no1697 {
    static int[] arr = new int[100001];
    static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        if(N == M){
            System.out.println(0);
        }else{
            BFS(N);
        }

    }

    public static void BFS(int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        arr[node] = 1;

        while (!queue.isEmpty()){
            int temp = queue.poll();

            for(int i=0; i<3; i++){
                int next;
                if(i == 0){
                    next = temp + 1;
                }else if (i == 1){
                    next = temp - 1;
                }else{
                    next = temp * 2;
                }

                if (next == M) {
                    System.out.println(arr[temp]);
                    return;
                }

                if(next > 0 && next < arr.length && arr[next] == 0){
                    queue.add(next);
                    arr[next] = arr[temp] + 1;
                }

            }

        }
    }
}
