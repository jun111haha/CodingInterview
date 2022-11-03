package Programmers.level1;

import java.util.*;
import java.util.stream.Collectors;

public class 햄버거만들기 {
    public static void main(String[] args) {
        int [] arr = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(arr));

    }
    public static int solution(int[] ingredient) {
        int answer = 0;
        String str = Arrays.stream(ingredient)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining());

        while (str.contains("1231")){
            str = str.replaceFirst("1231", "");
            answer++;
        }

        return answer;
    }
}

