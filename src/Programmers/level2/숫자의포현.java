package Programmers.level2;

public class 숫자의포현 {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(solution(n));
    }
    /*
    * for 문 2개를 돌려 n 에 i == j 값을 중첩
    * sum 값이 n 이랑  == 하면 answer++;
    *
    * */
    public static int solution(int n) {
        int answer = 0;
        int sum ;

        for(int i =1; i<=n; i++){
            sum = 0;
            for(int j =i; j<=n; j++) {
                sum += j;
                if(sum == n){
                    answer ++;
                    break;
                } else if(sum > n){
                    break;
                }
            }
        }

        return answer;
    }
}
