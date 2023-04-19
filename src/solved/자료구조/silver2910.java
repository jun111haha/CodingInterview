package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//빈도정렬
public class silver2910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(br.readLine());
        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
        for(int i=0; i<N; i++){
            String temp = stringTokenizer.nextToken();
            if(hashMap.containsKey(temp)){
                hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
            }else{
                hashMap.put(temp, 1);
            }
        }

        LinkedHashMap<String,Integer> result = sortMapByValue(hashMap, 1);
        Object[] key = result.keySet().toArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < key.length; i++) {
            int count = result.get(key[i]);
            while(count > 0) {
                stringBuilder.append(key[i] + " ");
                count -- ;
            }
        }

        System.out.println(hashMap);
        System.out.println(result);
        System.out.println(stringBuilder);
    }
    private static LinkedHashMap<String, Integer> sortMapByValue(Map<String, Integer> map, Integer orderBy){
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
        if(orderBy == 0) {
            Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        }
        else {
            Collections.sort(entries, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        }

        for (Map.Entry<String, Integer> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}
