package Programmers.level2;

import java.util.Arrays;

public class 최솟값만들기 {
    public static void main(String[] args) {
        int [] a = {1,2};
        int [] b = {3,4};
        System.out.println(solution(a, b));

    }
    public static int solution(int []a, int []b) {
        int answer = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0; i<a.length; i++){
            answer += a[i] * b[b.length - 1 - i];
        }

        return answer;
    }
}
