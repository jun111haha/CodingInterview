package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*
32 6
27 16 30 11 6 23
* */
public class 회전하는큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i =1; i<=N; i++){
            linkedList.add(i);
        }

        int[] arr = new int[M];
        int cnt = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<M; i++){
            int targetIndex = linkedList.indexOf(arr[i]);
            int halfIndex;

            if(linkedList.size() % 2 == 0){
                halfIndex = linkedList.size() / 2 - 1;
            }else{
                halfIndex = linkedList.size() / 2;
            }

            if(targetIndex <= halfIndex){
                for(int j=0; j<targetIndex; j ++){
                    linkedList.addLast(linkedList.pollFirst());
                    cnt ++;
                }
            }else{
                for(int j=0; j<linkedList.size() - targetIndex; j++){
                    linkedList.addFirst(linkedList.pollLast());
                    cnt ++;
                }
            }
            linkedList.pollFirst();
        }
        System.out.println(cnt); //59

    }
}
