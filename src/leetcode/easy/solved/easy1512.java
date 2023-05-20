package leetcode.easy.solved;

public class easy1512 {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,1,1,1}));
    }

    public static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    ans ++;
                    continue;
                }
            }
        }

        return ans;
    }

}
