package Programmers.level2;

import java.util.Arrays;

public class 이진변환반복하기 {
    public static void main(String[] args) {
        String s = "110010101001";
        System.out.println(Arrays.toString(solution(s)));
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];

        while (s.length()> 1){
            int cnt = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0'){
                    answer[1]++;
                }else{
                    cnt++;
                }
            }
            s = Integer.toBinaryString(cnt);
            answer[0]++;
        }

        return answer;
    }
}
