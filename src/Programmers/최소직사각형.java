package Programmers;

public class 최소직사각형 {
    public static void main(String[] args) {
        int [][] sizes = {
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}};
        System.out.println(solution(sizes));

    }
    public static int solution(int[][] sizes) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        for(int i =0; i<sizes.length; i++){
            int v = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            max1 = Math.max(max1 ,v);
            max2 = Math.max(max2, h);
        }
        answer = max1 * max2;
        return answer;
    }
}
