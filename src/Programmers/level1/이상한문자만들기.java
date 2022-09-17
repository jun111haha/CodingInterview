package Programmers.level1;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        String str = "try hello world";
        System.out.println(solution(str));
    }

    public static String solution(String s) {
        String answer = "";
        String [] strArray = s.split("");

        int idx = 0;
        for(int i=0; i< strArray.length; i++){
            if(strArray[i].equals(" ")){
                idx = 0;
            } else if(idx % 2 == 0){
                strArray[i]= strArray[i].toUpperCase();
                idx ++;
            } else if(idx % 2 != 0){
                strArray[i]= strArray[i].toLowerCase();
                idx ++;
            }

            answer += strArray[i];
        }
        return answer;
    }
}
