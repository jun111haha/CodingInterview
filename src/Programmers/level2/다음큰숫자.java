package Programmers.level2;

public class 다음큰숫자 {
    public static void main(String[] args) {
        int n = 78;
        System.out.println(solution(n));
    }
    /*
    * bitCount() : 10진수를 2진수로 변환후 1의 숫자 갯수를 세는 함수.
    * while 문 돌면서 n++ 증감 1의 숫자가 같으면 return n;
    * */
    public static int solution(int n) {
        int bitCountNumber = Integer.bitCount(n);
        while (true){
            n++;
            if(bitCountNumber == Integer.bitCount(n)){
                return n;
            }
        }
    }
}
