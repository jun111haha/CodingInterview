package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
3 5
1 2 4
2 3 4 5 6
* */
public class 대칭차집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        HashSet<Integer> hashSet1 = new HashSet<>();
        for(int i=0; i<N; i++){
            hashSet1.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> copySet = new HashSet<>(hashSet1);

        st = new StringTokenizer(br.readLine(), " ");
        HashSet<Integer> hashSet2 = new HashSet<>();
        for(int i=0; i<M; i++){
            hashSet2.add(Integer.parseInt(st.nextToken()));
        }

        hashSet1.removeAll(hashSet2);
        hashSet2.removeAll(copySet);

        System.out.println(hashSet1.size() + hashSet2.size()); //4
    }
}
