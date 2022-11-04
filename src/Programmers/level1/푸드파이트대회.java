package Programmers.level1;

import java.util.ArrayList;

public class 푸드파이트대회 {
    public static void main(String[] args) {
        int [] arr = {1, 3, 4, 6};
        System.out.println(solution(arr));
    }
    public static String solution(int[] food) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        for(int i =1; i<food.length; i++){
            if(food[i] % 2 == 0){
                list.add(food[i]);
            }else{
                list.add(food[i] - 1);
            }
        }

        for(int i =0; i<list.size(); i++){

        }

        return answer;
    }
}
