package Programmers.level1;

import java.util.PriorityQueue;

public class 명예의전당 {
    public static void main(String[] args) {
        int [] arr = {10, 100, 20, 150, 1, 100, 200};
        int k = 3;
        System.out.println(solution(k, arr));

    }
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i =0; i<score.length; i++){
            queue.add(score[i]);
            if(queue.size() > k){
                queue.poll();
            }

            answer[i] = queue.peek();
        }

        return answer;
    }
}
