package leetcode.easy.solved;

public class problem2529 {
    public static void main(String[] args) {
        System.out.println(maximumCount(new int[]{-3,-2,-1,0,0,1,2}));
    }

    public static int maximumCount(int[] nums) {
        if(nums.length == 1){
            return 1;
        }

        int positive = 0;
        int negative = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0 && nums[i] > 0){
                positive++;
            }else if(nums[i] != 0 && nums[i] < 0){
                negative++;
            }
        }

        return positive > negative ? positive : negative;
    }
}
