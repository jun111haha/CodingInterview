package leetcode.easy.solved;

import java.util.Arrays;

public class no2160 {
    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
    }

    public static int minimumSum(int num) {
        int ans = 0;
        int[] arr = new int[4];
        int i =0;
        while (num > 0){
            arr[i] = num % 10;
            num /= 10;
            i++;
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        return ((arr[0] * 10 + arr[2]) + arr[1] * 10 + arr[3]);
    }
}
