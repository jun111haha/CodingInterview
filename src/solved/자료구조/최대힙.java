package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class 최대힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());

        /*
         * PriorityQueue란 우선순위 큐로써 일반적인 큐의 구조 FIFO(First In First Out)를 가지면서,
         * 데이터가 들어온 순서대로 데이터가 나가는 것이 아닌 우선순위를 먼저 결정하고 그 우선순위가 높은 데이터가 먼저 나가는 자료구조이다.
         * PriorityQueue는 Heap을 이용하여 구현하는 것이 일반적이다. 시간복잡도 O(NLogN)
         * 우선순위를 중요시해야 하는 상황에서 주로 쓰인다.
         * 최대 값이 우선순위인 큐 = 최대 힙, 최소 값이 우선순위인 큐 = 최소 힙
         * */
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
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
