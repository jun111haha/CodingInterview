package leetcode.easy.solved;

import java.util.Arrays;

public class easy217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }

    public static boolean containsDuplicate(int[] nums) {
        if(nums.length == 0){
            return false;
        }

        boolean ans = false;
        Arrays.sort(nums);
        for(int i=0; i<nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                ans = true;
                break;
            }
        }

        return ans;
    }

}
