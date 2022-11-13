package Programmers.level1;

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(solution(n));
    }
    public static int solution(int n) {

        String strTemp = Integer.toString(n, 3);
        String str = "";
        for(int i= strTemp.length() - 1; i>=0; i--){
            str += strTemp.charAt(i);
        }

        return Integer.parseInt(str, 3);
    }
}
