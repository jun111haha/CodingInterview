package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class silver2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        StringTokenizer stringTokenizer;
        for(int i=0; i<N; i++){
            stringTokenizer = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                int temp = Integer.parseInt(stringTokenizer.nextToken());
                if(priorityQueue.size() == N){
                    if(priorityQueue.peek() < temp){
                        priorityQueue.poll();
                        priorityQueue.add(temp);
                    }
                }else{
                    priorityQueue.add(temp);
                }

            }
        }
        System.out.println(priorityQueue.poll());
    }
}
