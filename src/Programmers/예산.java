package Programmers;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        int [] arr = {2, 2, 3, 3};
        int budget = 10;

        System.out.println(solution(arr, budget));
    }
    /*
    * sum += 중첩으로 더해서
    * 예산보다 낮으면 cnt ++
    * */
    public static int solution(int[] arr, int budget) {
        int cnt = 0;
        int sum = 0;
        Arrays.sort(arr);

        for(int i =0; i<arr.length; i++){
            sum += arr[i];
            if(budget >= sum){
                cnt ++;
            }
        }

        return cnt;
    }
}
