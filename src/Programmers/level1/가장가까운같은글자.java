package Programmers.level1;

import java.util.Arrays;
import java.util.HashMap;

public class 가장가까운같은글자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            answer[i] = i - map.getOrDefault(ch,i + 1);
            map.put(ch,i);
        }

        System.out.println(map);
        return answer;
    }
}
