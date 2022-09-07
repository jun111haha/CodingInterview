package Programmers;

public class 시저암호 {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        System.out.println(solution(s, n));

    }
    public static String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();
        for(char c : chars){
            if(c == ' '){
                answer += c;
                continue;
            }

            if(Character.isUpperCase(c)){
                answer += (char) ((c - 'A' + n) % 26 + 'A');
            }else if(Character.isLowerCase(c)){
                answer += (char) ((c - 'a' + n) % 26 + 'a');

            }
        }

        return answer;
    }

}
