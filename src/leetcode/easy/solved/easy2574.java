package leetcode.easy.solved;

import java.util.Arrays;

public class easy2574 {
    public static void main(String[] args) {
        System.out.println(leftRigthDifference(new int[]{10,4,8,3}));
    }

    public static int[] leftRigthDifference(int[] nums) {
        var leftSum = new int[nums.length];
        var rightSum = new int[nums.length];
        var ans = new int[nums.length];

        for(int i=1; i<nums.length; i++){
            leftSum[i] = leftSum[i- 1] + nums[i - 1];
        }

        for(int i=nums.length-2; i>=0; i--){
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        for(int i=0; i<nums.length; i++){
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}
