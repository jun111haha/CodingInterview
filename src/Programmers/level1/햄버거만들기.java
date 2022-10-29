package Programmers.level1;

import java.util.Arrays;

public class 햄버거만들기 {
    public static void main(String[] args) {
        int [] arr = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(arr));

    }
    public static int solution(int[] ingredient) {
        int answer = 0;
        String ingredientString = Arrays.toString(ingredient)
                .replace("[","")
                .replace("]","")
                .replaceAll(", ","");

        while (ingredientString.contains("1231")){
            ingredientString = ingredientString.replaceFirst("1231", "");
            answer++;
        }

        return answer;
    }
}
