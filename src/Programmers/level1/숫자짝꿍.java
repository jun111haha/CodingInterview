package Programmers.level1;

import java.util.*;
import java.util.stream.Collectors;

public class 숫자짝꿍 {
    public static void main(String[] args) {
        String X = "100";
        String Y = "203045";
        System.out.println(solution(X, Y));
    }

    public static String solution(String X, String Y) {
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();

        List<String> list = new ArrayList<>();

        for (String key : X.split("")) {
            xMap.put(key, xMap.getOrDefault(key, 0) + 1);
        }

        for (String key : Y.split("")) {
            yMap.put(key, yMap.getOrDefault(key, 0) + 1);
        }

        for(String key : xMap.keySet()){
            if(!yMap.containsKey(key)){
                continue;
            }

            int len = Math.min(xMap.get(key), yMap.get(key));
            for(int i =0; i <len; i++){
                list.add(key);
            }
        }
        String answer = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.joining());
        if(answer.isEmpty()) return "-1";
        if(answer.startsWith("0")) return "0";
        return answer;
    }
}
