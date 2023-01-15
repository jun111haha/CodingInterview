package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 베스트셀러 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=0; i<tc; i++){
            String temp = br.readLine();
            hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<>(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o2.getValue() == o1.getValue()){
                    return o1.getKey().compareTo(o2.getKey());
                }

                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        System.out.println(list.get(0).getKey());
    }
}
