package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=tc; i++){
            queue.add(i);
        }

        while (!queue.isEmpty()){
            if (queue.size() == 1) break;
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.println(queue.poll());
    }
}
