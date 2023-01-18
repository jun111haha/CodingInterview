package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 차집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            hashSet1.add(Integer.valueOf(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++){
            hashSet2.add(Integer.valueOf(st.nextToken()));
        }

        hashSet1.removeAll(hashSet2);
        hashSet1.stream().sorted().forEach(i -> {
            sb.append(i + " ");
        });

        System.out.println(hashSet1.size());
        System.out.println(sb);
    }
}
