package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 학생인기도측정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        while (st1.hasMoreTokens()){
            String temp = st1.nextToken();
            hashMap.put(temp, hashMap.getOrDefault(temp, 0));
        }

        for(int i=0; i<tc; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " " );
            while (st2.hasMoreTokens()){
                String temp = st2.nextToken();
                hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue() > o2.getValue()){
                    return -1;
                }else if(o1.getValue() < o2.getValue()){
                    return 1;
                }

                return o1.getKey().compareTo(o2.getKey());
            }
        });

        for(int i =0; i<list.size(); i++){
            String temp = String.valueOf(list.get(i));
            sb.append(temp.replaceAll("=", " ") + "\n");
        }
        System.out.println(sb);
    }
}
