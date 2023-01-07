package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스문제0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=N; i++){
            queue.add(i);
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()){
            for(int i=1; i<=M; i++){
                if(i == M){
                    list.add(queue.poll());
                }else{
                    queue.add(queue.poll());
                }
            }
        }

        sb.append("<");
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == list.get(list.size() - 1)){
                sb.append(list.get(i));
            }else{
                sb.append(list.get(i) + ", ");
            }
        }
        sb.append(">");

        System.out.println(sb);
    }
}
