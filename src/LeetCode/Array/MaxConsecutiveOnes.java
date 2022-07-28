package LeetCode.Array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] num = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(num));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int maxNum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                cnt++;
               maxNum = Math.max(cnt, maxNum);
            }else{
                cnt = 0;
            }
        }
        return maxNum;
    }
}
