package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 최소힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<tc; i++){
            int temp = Integer.parseInt(br.readLine());

            if(minHeap.isEmpty() && temp == 0){
                sb.append(0 + "\n");
            }else if(!minHeap.isEmpty() && temp == 0){
                sb.append(minHeap.poll() + "\n");
            }else{
                minHeap.add(temp);
            }
        }
        System.out.println(sb);
    }
}
