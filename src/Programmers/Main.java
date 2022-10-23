package Programmers;

public class Main {
    public static void main(String[] args) {
        String [] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(babbling));
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] strArr = {"aya", "ye", "woo", "ma"};
        String[] banList = {"ayaaya", "yeye", "woowoo", "mama"};

        for(int i=0; i<babbling.length; i++){
            String temp = babbling[i];
            for(String ban : banList){
                temp = temp.replace(ban, "ban");
            }
            for(String speak : strArr){
                temp = temp.replace(speak, "");
            }
            if(temp.length() == 0){
                answer++;
            }
        }

        return answer;
    }

}
