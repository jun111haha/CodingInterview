package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 회전하는큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i =1; i<=n; i++){
            linkedList.add(i);
        }

        int[] seq = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;
        for(int i = 0; i < m; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i =0; i<m; i++){
            int targetIdx = linkedList.indexOf(seq[i]);
            int halfIdx;

            if(linkedList.size() % 2 == 0){
                halfIdx = linkedList.size() / 2 - 1;
            }else{
                halfIdx = linkedList.size() / 2;
            }

            // 중간 지점 또는 중간 지점보다 원소의 위치가 앞에 있을 경우
            if(targetIdx <= halfIdx){
                // idx 보다 앞에 있는 원소들을 모두 뒤로 보낸다. (2번 연산)
                for(int j =0; j<targetIdx; j++){
                    int tmp = linkedList.pollFirst();
                    linkedList.offerLast(tmp);
                    cnt++;
                }
            }else{
                // idx를 포함한 뒤에 있는 원소들을 모두 앞으로 보낸다. (3번 연산)
                for(int j =0; j<linkedList.size() - targetIdx; j++){
                    int tmp = linkedList.pollLast();
                    linkedList.offerFirst(tmp);
                    cnt++;
                }
            }
            linkedList.pollFirst();
        }
        System.out.println(cnt);
    }
}
