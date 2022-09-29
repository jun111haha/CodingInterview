package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 최소힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
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
