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
        for(int i =0; i<commands.length; i++){
            int [] arrTemp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(arrTemp);
            answer[i] = arrTemp[commands[i][2] - 1];
        }

        return answer;
    }




}
