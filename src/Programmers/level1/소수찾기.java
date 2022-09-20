package Programmers.level1;

public class 소수찾기 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(solution(n));
    }

    //에라토스테네스의 체
    public static int solution(int n) {
        int answer = 0;
        int [] numbers = new int[n + 1];
        //2부터 n까지의 수를 배열에 넣는다.
        for(int i =2; i<=n; i++){
            numbers[i] = i;
        }

        //2부터 시작해서 그의 배수들을 0으로 만든다.
        //후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
        for(int i =2; i<=n; i++){
            if(numbers[i] == 0) continue;;

            for(int j =2*i; j<=n; j +=i){
                numbers[j] = 0;
            }
        }

        //배열에서 0이 아닌 것들의 개수를 세준다.
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i]!=0) {
                answer++;
            }
        }

        return answer;
    }
}
