package leetcode.easy.solved;

public class easy1920 {
    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{0,2,1,5,3,4}));
    }

    public static int[] buildArray(int[] nums) {
        var ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
