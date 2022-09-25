package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int input = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for(int i =1; i<=input; i++){
            queue.offer(i);
        }

        while (queue.size() > 1){
            queue.poll();
            queue.offer(queue.poll());
        }

        sb.append(queue.poll());
        System.out.println(sb);
    }
}
