package programmers;

import java.util.HashSet;

public class 둘만의암호 {
    public static void main(String[] args) {
        System.out.println(solution("aukks", "wbqd", 5));
    }

    public static String solution(String s, String skip, int index) {
        String answer = "";

        HashSet<String> hashSet = new HashSet<>();
        for(int i=0; i<skip.length(); i++) hashSet.add(String.valueOf(skip.charAt(i)));

        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            for(int j=0; j<index; j++){
                temp ++;

                if('z' < temp) temp = 'a';

                if(hashSet.contains(Character.toString(temp))) j--;

            }

            answer+= temp;
        }

        return answer;
    }
}
