package leetcode.unresolved;

import java.util.Arrays;

public class problem66 {
    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{1,2,3}));
    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
