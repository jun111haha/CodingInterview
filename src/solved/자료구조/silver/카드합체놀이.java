package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 카드합체놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            priorityQueue.add(Long.parseLong(st.nextToken()));
        }

        System.out.println(priorityQueue);
        for(int i=0; i<M; i++){
            Long temp1 = priorityQueue.poll();
            Long temp2 = priorityQueue.poll();

            priorityQueue.add(temp1 + temp2);
            priorityQueue.add(temp1 + temp2);
        }

        long sum = 0;
        System.out.println(priorityQueue);
        while (!priorityQueue.isEmpty()){
            sum += priorityQueue.poll();
        }

        System.out.println(sum);
    }
}
