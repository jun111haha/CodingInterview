package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 암기왕 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());

        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> hashSet = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            hashSet.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(hashSet.contains(temp)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
