package Programmers;

import java.util.Arrays;

public class 최댓값과최솟값 {
    public static void main(String[] args) {
        String str = "-1 -2 -3 -4";
        System.out.println(solution(str));

    }
    public static String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        int[] nArr = new int[strArr.length];

        for(int i =0; i<strArr.length; i++){
            nArr[i] = Integer.parseInt(strArr[i]);
        }

        int max = Arrays.stream(nArr).max().getAsInt();
        int min = Arrays.stream(nArr).min().getAsInt();

        answer = min + " " + max;

        return answer;
    }
}
