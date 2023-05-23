package leetcode.easy.solved;

public class easy1480 {
    public static void main(String[] args) {
        System.out.println(runningSum(new int[]{1,2,3,4}));
    }
    public static int[] runningSum(int[] nums) {
        var ans = new int[nums.length];
        ans[0] = nums[0];
        ans[1] = nums[0] + nums[1];

        for(int i=2; i<nums.length; i++){
            ans[i] = ans[i - 1] + nums[i];
        }

        return ans;
    }

}
