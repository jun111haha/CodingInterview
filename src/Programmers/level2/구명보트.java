package Programmers.level2;

import java.util.Arrays;

public class 구명보트 {
    public static void main(String[] args) {
        int [] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println(solution(people, limit));
    }

    public static int solution(int[] people, int limit) {
        Arrays.sort(people);

        int cnt = 0;
        int minIndex = 0;
        for(int i = people.length - 1; i>= minIndex; i--){
            if(people[i] + people[minIndex] <= limit){
                cnt++;
                minIndex++;
            }else{
                cnt++; //혼자 구명보트 탄것으로 처리
            }
        }



        return cnt;
    }
}
