package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 절댓값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if(abs1 == abs2){
                return o1 > o2 ? 1 : -1;
            }
            return abs1 - abs2;
        });

        for(int i =0; i<test_case; i++){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                if(!priorityQueue.isEmpty()){
                    System.out.println(priorityQueue.poll());
                }else{
                    System.out.println(0);
                }
                continue;
            }
            priorityQueue.add(n);
        }
    }
}

