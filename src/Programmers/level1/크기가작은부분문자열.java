package Programmers.level1;

public class 크기가작은부분문자열 {
    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));
    }

    public static int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long num = Long.parseLong(p);

        for(int i =0; i<=t.length() - pLength; i++){
            if(Long.parseLong(t.substring(i, i + pLength)) <= num){
                answer++;
            }
        }

        return answer;
    }
}
