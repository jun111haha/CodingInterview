package Programmers.level1;

import java.util.HashMap;

public class 성격유형검사하기 {
    public static void main(String[] args) {
        String [] survey = {"TR", "RT", "TR"};
        int [] choices = {7, 1, 3};
        System.out.println(solution(survey, choices));

    }

    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();

        String[][] typeArr = new String[][]{{"R", "T"}, {"C", "F"}, {"J", "M"}, {"A", "N"}};
        for(String[] type : typeArr){
            hashMap.put(type[0], 0);
            hashMap.put(type[1], 0);
        }

        for(int i = 0; i < choices.length; i++){
            String a = survey[i].substring(0, 1);
            String b = survey[i].substring(1);

            switch(choices[i]){
                case 1 : hashMap.replace(a, hashMap.get(a) + 3);
                    break;
                case 2 : hashMap.replace(a, hashMap.get(a) + 2);
                    break;
                case 3 : hashMap.replace(a, hashMap.get(a) + 1);
                    break;
                case 4 :
                    break;
                case 5 : hashMap.replace(b, hashMap.get(b) + 1);
                    break;
                case 6 : hashMap.replace(b, hashMap.get(b) + 2);
                    break;
                case 7 : hashMap.replace(b, hashMap.get(b) + 3);
                    break;
            }

        }

        System.out.println(hashMap);
        for(int i =0; i<typeArr.length; i++){
            answer += typeAdd(hashMap, typeArr[i][0], typeArr[i][1]);
        }
        return answer;
    }

    public static String typeAdd(HashMap<String, Integer> map, String type1, String type2){
        String result = "";

        if(map.get(type1) < map.get(type2)){
            result += type2;
        }else if(map.get(type1) > map.get(type2)){
            result += type1;
        }else{
            if(type1.compareTo(type2) < 0){
                result += type1;
            }else if(type1.compareTo(type2) > 0){
                result += type2;
            }

        }
        return result;
    }
}
