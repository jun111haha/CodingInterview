package solved.silver5;

public class 셀프넘버 {
    public static void main(String[] args) {

        boolean[] checkArr = new boolean[10001];// 1부터 10000이므로

        for (int i = 1; i < 10001; i++){
            int n = solution(i);

            if(n < 10001) {
                checkArr[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!checkArr[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int solution(int n){
        int sum = n;
        while (n != 0){
            sum = sum + (n % 10); //첫 째 자리수
            n = n / 10; //10을 나누어 첫 째 자리를 없앤다
        }

        return sum;
    }
}
