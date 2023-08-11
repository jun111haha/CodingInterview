package programmers;

public class 기사단원의무기 {
    public static void main(String[] args) {
        System.out.println(solution(10,3, 2));
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        var arr = new int[number];
        for(int i=1; i<=number; i++){
            arr[i - 1] = i;
        }

        for(int i=0; i<arr.length; i++){
            arr[i] = prime(arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] <= limit){
                answer += arr[i];
            }else{
                answer += power;
            }
        }

        return answer;
    }

    public static int prime(int n) {
        int result = 0;

        for(int i = 1; i * i <= n; i++) {
            if(i * i == n){
                result += 1;
            } else if(n % i == 0){
                result += 2;
            }
        }

        return result;
    }
}
