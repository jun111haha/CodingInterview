package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet1 = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        ArrayList<String> arraysList = new ArrayList<>();

        for(int i=0; i<N; i++){
            hashSet1.add(br.readLine());
        }

        for(int i=0; i<M; i++){
            hashSet2.add(br.readLine());
        }

        for(String str : hashSet2){
            if(hashSet1.contains(str)){
                arraysList.add(str);
            }
        }
        Collections.sort(arraysList);
        System.out.println(arraysList.size());
        for(String str : arraysList){
            System.out.println(str);
        }
    }
}
