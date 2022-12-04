package Programmers.level1;

public class 문자열나누기 {
    public static void main(String[] args) {
        System.out.println(solution("aaabbaccccabba"));
    }

    public static int solution(String s) {
        int answer = 0;

        Character firstLetter = null;
        int sameCnt = 0;
        int diffCnt = 0;

        for(int i =0; i<s.length(); i++){
            if(firstLetter == null){
                firstLetter = s.charAt(i);
                sameCnt ++;
                continue;
            }

            if(s.charAt(i) == firstLetter){
                sameCnt ++;
            }else{
                diffCnt ++;
            }

            if(sameCnt == diffCnt){
                answer++;
                sameCnt = 0;
                diffCnt = 0;
                firstLetter = null;
            }
        }

        //
        if(firstLetter != null){
            answer++;
        }

        System.out.println(firstLetter);
        return answer;
    }
}
