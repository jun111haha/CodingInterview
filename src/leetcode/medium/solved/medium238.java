package leetcode.medium.solved;

public class medium238 {
    public static void main(String[] args) {
        System.out.println(productExceptSelf(new int[]{1,2,3,4}));
    }

    public static int[] productExceptSelf(int[] nums) {
        var ans = new int[nums.length];
        int pro = 1;

        for(int i=0; i<nums.length; i++){
            pro = 1;
            for(int j=0; j<nums.length; j++){
                if(i == j) continue;
                pro *= nums[j];
            }
            ans[i] = pro;
        }

        return ans;
    }
}
