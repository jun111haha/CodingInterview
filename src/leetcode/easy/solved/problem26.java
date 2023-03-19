package leetcode.easy.solved;

import java.util.Arrays;

public class problem26 {
    public static void main(String[] args) {
        problem26 problem26 = new problem26();
        System.out.println(problem26.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;

        int addIndex = 1;
        for(int i=1; i<nums.length-1; i++){
            if(nums[i] < nums[i + 1]){
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return addIndex;
    }
}
