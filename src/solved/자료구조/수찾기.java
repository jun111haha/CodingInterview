package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
* 리스트로 풀면 O(n) 시간복잡도 발생
* 해쉬셋 사용 O(1) 시간복잡도 발생하여 런타임오류이 발생하지 않음.
* */
public class 수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int input = Integer.parseInt(br.readLine());

        HashSet<Integer> hashSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i =0; i<input; i++){
            hashSet.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());

            if(hashSet.contains(num) == true) {
                sb.append(1).append("\n");
            } else{
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}
