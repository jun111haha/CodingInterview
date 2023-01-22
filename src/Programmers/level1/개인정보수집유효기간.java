package Programmers.level1;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 개인정보수집유효기간 {
    public static void main(String[] args) throws ParseException {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        System.out.println(Arrays.toString(solution(today, terms, privacies)));

    }
    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        String[] todayArr = today.split("\\.");
        int todayCnt = Integer.parseInt(todayArr[0]) * 12 * 28
                + Integer.parseInt(todayArr[1]) * 28
                + Integer.parseInt(todayArr[2]);

        HashMap<String, String> termsMap = new HashMap<>();

        for(int i=0; i<terms.length; i++){
            String[] temp = terms[i].split(" ");
            String key = temp[0];
            String value = temp[1];
            termsMap.put(key, value);
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<privacies.length; i++){
            String[] temp = privacies[i].split(" ");
            String key = temp[1];
            String[] privacyTemp = temp[0].split("\\.");
            String termValue = termsMap.get(key);
            int year = Integer.parseInt(privacyTemp[0]);
            int month = Integer.parseInt(privacyTemp[1]);
            int day = Integer.parseInt(privacyTemp[2]);

            month += Integer.parseInt(termValue);
            int value = year * 12 * 28 + month * 28 + day - 1; //유효기간 마지막 날짜

            if(todayCnt > value){
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

}
