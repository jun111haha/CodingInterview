package Programmers;

import java.util.Arrays;

public class 체육복 {
    public static void main(String[] args) {
        int n = 5;
        int [] lost = {2,4};
        int [] reserve = {1,3,5};
        System.out.println(solution(n, lost,  reserve));
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        int [] people = new  int[n];
        int answer = n;

        for(int l : lost){
            people[l - 1] --;
        }

        for(int r : reserve){
            people[r - 1] ++;
        }
        System.out.println(Arrays.toString(people));

        for(int i = 0; i< people.length; i++){
            if(people[i] == -1){
                //잃어버리기만 한사람
                if(i-1 >= 0 && people[i-1] == 1){
                    people[i]++;
                    people[i-1]--;
                //여분이 남는사람
                }else if(i+1 < people.length && people[i+1] == 1){
                    people[i]++;
                    people[i+1]--;
                //찾지 못했다면 체육복을 못입은사람.
                }else{
                    answer--;
                }
            }
        }

        return answer;
    }

}
