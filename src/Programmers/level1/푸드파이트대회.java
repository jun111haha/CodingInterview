package Programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class 푸드파이트대회 {
    public static void main(String[] args) {
        int [] arr = {1, 7, 1, 2};
        System.out.println(solution(arr));
    }
    public static String solution(int[] food) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();

        food[0] = 0 ;
        for(int i =1; i<food.length; i++){
            if(food[i] % 2 != 0){
                food[i] = food[i] - 1;
            }
            food[i] = food[i] / 2;
        }

        for(int i =1; i<food.length; i++){
           for(int j =1; j<=food[i]; j++){
               if(food[i] != 0){
                   list.add(i);
               }
           }
        }

        list.add(0);
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i =0; i<list.size(); i++){
            list2.add(list.get(i));
        }

        list2.remove(list.size() - 1);
        Collections.reverse(list2);

        ArrayList<Integer> totalList = new ArrayList<>();
        totalList.addAll(list);
        totalList.addAll(list2);

        for(int i =0; i<totalList.size(); i++){
            answer += totalList.get(i);
        }
        return answer;
    }
}
