package programmers;

public class 옹알이2 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
    public static int solution(String[] babbling) {
        int answer = 0;

        for(String str : babbling){
            str = str.replace("ayaaya", String.valueOf(1));
            str = str.replace("yeye", String.valueOf(1));
            str = str.replace("woowoo", String.valueOf(1));
            str = str.replace("mama", String.valueOf(1));

            str = str.replace("aya", " ");
            str = str.replace("ye", " ");
            str = str.replace("woo", " ");
            str = str.replace("ma", " ");
            str = str.replace(" ", "");

            if(str.length() == 0){
                answer++;
            }

        }

        return answer;
    }
}
