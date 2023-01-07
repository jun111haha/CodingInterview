package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 숫자카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int tc1 = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<tc1; i++){
            hashSet.add(Integer.parseInt(st1.nextToken()));
        }

        int tc2 = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<tc2; i++){
            int n = Integer.parseInt(st2.nextToken());
            if(hashSet.contains(n)){
                sb.append(1 + " ");
            }else{
                sb.append(0 + " ");
            }
        }

        System.out.println(sb);
    }

}
