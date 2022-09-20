package Programmers.level2;

public class 피보나치수 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }

    //재귀로 풀었더니 런타임발생 DP 적용 메모제이션 방법으로 구현
    public static int solution(int n) {
        int[] answer = new int[n + 1];
        for(int i =0; i<answer.length; i++){
            if(i == 0){
                answer[i] = 0;
            }else if(i == 1){
                answer[i] = 1;
            }else{
                int sum = answer[i - 2] + answer[i - 1];
                answer[i] = sum % 1234567;
            }

        }
        return answer[n];
    }
}


