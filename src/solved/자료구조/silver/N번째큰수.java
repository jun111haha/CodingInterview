package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class N번째큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<tc; i++){
            priorityQueue.add(Integer.parseInt(st.nextToken()));
        }

        for(int i=1; i<tc; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<tc; j++){
                priorityQueue.poll();
                priorityQueue.add(Integer.parseInt(st.nextToken()));
            }
        }

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
    }
}
