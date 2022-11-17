package Programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class 영어끝말잇기 {
    public static void main(String[] args) {
        String [] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        int n = 2;
        System.out.println(Arrays.toString(solution(n, words)));
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<>();
        for(int i =0; i<words.length; i++){
            if(list.contains(words[i])){
                answer[0] = (i % n) + 1; //사람
                answer[1] = (i / n) + 1; //차례
                break;
            }else{
                list.add(words[i]);
            }

           if(i > 0 && words[i].charAt(0)
                   != list.get(i - 1).charAt(list.get(i - 1).length() - 1)){
               answer[0] = (i % n) + 1; //사람
               answer[1] = (i / n) + 1; //차례
               break;
           }

        }

        return answer;
    }

}
