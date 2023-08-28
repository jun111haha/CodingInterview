package programmers;

import java.util.Arrays;
import java.util.Collections;

public class 과일장수 {
    public static void main(String[] args) {
        System.out.println(solution(4,3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] arr = new Integer[score.length];
        for(int i = 0 ; i < score.length ; i++){
            arr[i] = new Integer(score[i]);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = m - 1 ;  i < arr.length ; i+= m){
            answer += (arr[i] * m);
        }

        return answer;
    }

}
