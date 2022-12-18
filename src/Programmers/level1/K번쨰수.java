package Programmers.level1;

import java.util.Arrays;

public class K번쨰수 {
    public static void main(String[] args) {

        int [] arr = {1, 5, 2, 6, 3, 7, 4};
        int [][] commands = {
                 {2, 5, 3}
                ,{4, 4, 1}
                ,{1, 7, 3}
        };

        System.out.println(solution(arr, commands));
    }
    /*
    * copyOfRange 원본 배열을 복사하여 인덱스를 이용해서 자를수가 있음.
    * */
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int a = 0;
        for(int[] info : commands){
            int i = info[0];
            int j = info[1];
            int k = info[2];

            int[] buf = Arrays.copyOfRange(array,i - 1, j);
            Arrays.sort(buf);
            answer[a] = buf[k - 1];
            a++;
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
