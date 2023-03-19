package leetcode.easy.solved;

public class problem136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
    }

    public static int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int cnt = 0;
        for(int i =0; i<nums.length; i++){
            cnt = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    cnt ++;
                }
            }

            if(cnt == 1){
                return nums[i];
            }
        }

        return 0;
    }
}
