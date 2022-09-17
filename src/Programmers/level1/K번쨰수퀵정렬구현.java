package Programmers.level1;

public class K번쨰수퀵정렬구현 {
    public static void main(String[] args) {
        int [] arr = {1, 5, 2, 6, 3, 7, 4};
        int [][] commands = {
                {2, 5, 3}
                ,{4, 4, 1}
                ,{1, 7, 3}
        };

        for(int k : solution(arr, commands)){
            System.out.println(k);
        }
    }

    /*
     * API 사용안하고 퀵정렬 직접구현
     * */
    public static int[] solution(int[] array, int[][] commands) {
        int n = 0;
        int[] ret = new int[commands.length];

        while(n < commands.length){
            int m = commands[n][1] - commands[n][0] + 1;

            if(m == 1){
                ret[n] = array[commands[n++][0]-1];
                continue;
            }

            int[] a = new int[m];
            int j = 0;
            for(int i = commands[n][0]-1; i < commands[n][1]; i++)
                a[j++] = array[i];

            sort(a, 0, m-1);

            ret[n] = a[commands[n++][2]-1];
        }

        return ret;
    }

    static void sort(int[] a, int left, int right){
        int pl = left;
        int pr = right;
        int x = a[(pl+pr)/2];

        do{
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;
            if(pl <= pr){
                int temp = a[pl];
                a[pl] = a[pr];
                a[pr] = temp;
                pl++;
                pr--;
            }
        }while(pl <= pr);

        if(left < pr) sort(a, left, pr);
        if(right > pl) sort(a, pl, right);
    }
}

