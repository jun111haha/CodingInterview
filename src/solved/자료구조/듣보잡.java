package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 듣보잡 {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet = new HashSet<>();
        for(int i =0; i<n; i++){
            String temp = br.readLine();
            hashSet.add(temp);
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i =0; i<m; i++){
            String temp = br.readLine();
            if(hashSet.contains(temp)){
                list.add(temp);
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(String str : list){
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
