package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 프린터큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int test_case = Integer.parseInt(br.readLine());

        for(int i =0; i<test_case; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            StringTokenizer str = new StringTokenizer(br.readLine());
            LinkedList<int[]> queue = new LinkedList<>();

            for(int j =0; str.hasMoreTokens(); j++){
                queue.add(new int[]{j, Integer.parseInt(str.nextToken())});
            }

            int cnt = 0;
            while (!queue.isEmpty()){
                int [] tempArr = queue.poll();
                boolean chk = true;

                for(int j =0; j<queue.size(); j++){
                    if(tempArr[1] < queue.get(j)[1]){
                        queue.add(tempArr);

                        for(int k =0; k<j; k++) {
                            queue.add(queue.poll());
                        }

                        chk = false;
                        break;
                    }
                }
                if(chk == false)
                    continue;

                cnt++;
                if(tempArr[0] == m)
                    break;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
