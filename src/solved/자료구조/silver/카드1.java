package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 카드1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for(int i =1; i<=tc; i++){
            queue.offer(i);
        }

        int[] arr = new int[tc];
        while (!queue.isEmpty()){
            for(int i =0; i<arr.length; i++){
                arr[i] = queue.poll();
                queue.offer(queue.poll());
            }
            if(queue.size() == 1) break;
        }

        for(int i : arr){
            sb.append(i + " ");
        }
        System.out.println(sb);
    }
}
