package Programmers.level0;

public class 다음에올숫자 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,4,8}));

    }

    public static int solution(int[] common) {
        int answer = 0;

        int a = common[1]-common[0]; //공차
        int b = common[1]/common[0]; //공비

        if(a == common[2]-common[1]) { //등차인 경우
            answer = common[common.length-1] + a;
        } else { //등비인 경우
            answer = b*common[common.length-1];
        }

        return answer;
    }
}
