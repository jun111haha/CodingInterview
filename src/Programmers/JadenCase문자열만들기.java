package Programmers;

public class JadenCase문자열만들기 {
    public static void main(String[] args) {
        String str = "3people unFollowed me";
        System.out.println(solution(str));
    }

    public static String solution(String s) {
        String answer = "";
        String [] strArray = s.toLowerCase().split("");
        boolean flag = true;

        for(int i=0; i<strArray.length; i++){
            answer += flag ? strArray[i].toUpperCase() : strArray[i];
            flag = strArray[i].equals(" ") ? true : false;
        }

        return answer;
    }
}
