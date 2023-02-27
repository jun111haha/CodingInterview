package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 풍선터트리기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        sb.append("1" + " ");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Deque<int[]> deque = new ArrayDeque<>();

        int move = Integer.parseInt(st.nextToken());
        for(int i=2; i<=tc; i++){
            deque.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }

        while (!deque.isEmpty()){
            if(move > 0){
                for(int i=1; i<move; i++){
                    deque.add(deque.pollFirst());
                }

                int[] next = deque.removeFirst();
                move = next[1];
                sb.append(next[0] + " ");
            }else{
                for(int i=move; i<-1; i++){
                    deque.addFirst(deque.pollLast());
                }

                int[] next = deque.removeLast();
                move = next[1];
                sb.append(next[0] + " ");
            }
        }
        System.out.println(sb);
    }
}
