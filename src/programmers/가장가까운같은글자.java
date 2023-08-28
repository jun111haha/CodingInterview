package programmers;

import java.util.Arrays;

public class 가장가까운같은글자 {
    public static void main(String[] args) {
        System.out.println(solution("banana"));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        for(int i=0; i<s.length(); i++){
            if(i != 0){
                int index = s.substring(0, i).lastIndexOf(s.charAt(i));
                System.out.println(i + " " + index);
                if(index != -1){
                    answer[i] = i - index;
                }else{
                    answer[i] = index;
                }
            }else{
                answer[i] = -1;
            }
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
