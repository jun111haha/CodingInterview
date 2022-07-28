package LeetCode.Array;

import java.util.Arrays;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        for(int i : sortedSquares(nums)){
            System.out.print(i + " ");
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            int abs = Math.abs(nums[i]);
            answer[i] = (int) Math.pow(abs, 2);
        }

        Arrays.sort(answer);
        return answer;
    }
}
