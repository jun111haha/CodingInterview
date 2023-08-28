package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 대충만든자판 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"}));
    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(String s : keymap){
            for(int i=0; i<s.length(); i++){
                hashMap.put(s.charAt(i), Math.min(i + 1, hashMap.getOrDefault(s.charAt(i), Integer.MAX_VALUE)));
            }
        }

        for(int i=0; i<targets.length; i++){
            String strTemp = targets[i];
            for(int j=0; j<strTemp.length(); j++){
                char key = strTemp.charAt(j);
                if(hashMap.containsKey(key)){
                    answer[i] += hashMap.get(key);
                }else{
                    answer[i] = -1;
                    break;
                }

            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

}
