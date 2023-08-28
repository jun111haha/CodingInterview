package programmers;

public class 크기가작은부분문자열 {
    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));
    }

    public static int solution(String t, String p) {
        int len = p.length();
        long num = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i <= t.length() - len; i++) {
            System.out.println((Long.parseLong(t.substring(i, i + len))));
            if (Long.parseLong(t.substring(i, i + len)) <= num) {
                answer++;
            }
        }

        return answer;
    }
}
