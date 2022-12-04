package Programmers.level1;

import java.util.Arrays;

public class 기사단원의무기 {
    public static void main(String[] args) {
        System.out.println(solution(5, 3, 2));
    }
    public static int solution(int number, int limit, int power) {
        int answer = 0;

        int [] arr = new int[number + 1];
        for(int i =1; i<=number; i++){
            arr[i] = i;
        }

        for(int i =1; i<=number; i++){
            arr[i] = countDivisors(arr[i]);
        }

        for(int i =1; i<=number; i++){
            if(arr[i] > limit){
                arr[i] = power;
            }
        }

        answer = Arrays.stream(arr).sum();
        return answer;
    }

    //약수 개수 구하는 메서드
    public static int countDivisors(int n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i)
                    cnt++;
                else
                    cnt = cnt + 2;
            }
        }
        return cnt;
    }
}
