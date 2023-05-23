package leetcode.easy.solved;

public class easy1365 {
    public static void main(String[] args) {
        System.out.println(smallerNumbersThanCurrent(new int[]{8,1,2,2,3}));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        var ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int cnt = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    cnt++;
                }
            }
            ans[i] = cnt;
        }

        return ans;
    }
}
