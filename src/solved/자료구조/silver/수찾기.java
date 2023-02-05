package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0; i<N; i++){
            hashSet.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(hashSet.contains(temp)){
                sb.append("1" + "\n");
            }else{
                sb.append("0" + "\n");

            }
        }
        System.out.println(sb);
    }
}
