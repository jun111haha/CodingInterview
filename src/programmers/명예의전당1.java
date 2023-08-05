package programmers;

import java.io.IOException;
import java.util.PriorityQueue;

public class 명예의전당1 {
    public static void main(String[] args) throws IOException {
        System.out.println(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200}));
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i=0; i<score.length; i++){
            priorityQueue.add(score[i]);
            if(priorityQueue.size() > k){
                priorityQueue.poll();
            }

            answer[i] = priorityQueue.peek();
        }

        return answer;
    }

}
