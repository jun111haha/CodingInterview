package leetcode.easy.solved;

public class easy35 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < target){
                index++;
            }
        }

        return index;
    }
}
