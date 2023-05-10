package leetcode.medium.solved;

public class medium53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            ans = Math.max(sum, ans);

            if(sum < 0) sum = 0;
        }

        return ans;
    }

}
