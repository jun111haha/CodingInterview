package Programmers.level1;
import java.util.*;

public class 과일장수 {
    public static void main(String[] args) {
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(k, m, score));

    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<arr.length; i++){
            if(i< (m * ( arr.length /m ))){
                if(i % m == m - 1){
                    answer+= arr[i] * m;
                }
            }
        }

        return answer;
    }
}
