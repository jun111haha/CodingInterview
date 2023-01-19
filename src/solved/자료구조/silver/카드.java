package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

// https://www.acmicpc.net/problem/1835
public class 카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        deque.add(tc);
        if(tc == 1){
            System.out.println("1");
            return;
        }else{
            deque.addFirst(tc - 1);
            while (true){
                tc --;
                for(int i=tc; i>0; i--){
                    int last = deque.peekLast();
                    deque.addFirst(last);
                    deque.pollLast();
                }
                if(tc == 1) break;
                deque.addFirst(tc - 1);
            }
        }

        System.out.println(deque);
    }
}
