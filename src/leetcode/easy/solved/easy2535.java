package leetcode.easy.solved;

import java.util.Arrays;

public class easy2535 {
    public static void main(String[] args) {
        System.out.println(differenceOfSum(new int[]{1,15,6,3}));

    }

    public static int differenceOfSum(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int sum2 = 0;
        for(int i=0; i<nums.length; i++){
            String tempStr = String.valueOf(nums[i]);
            if(tempStr.length() > 1){
                int tempInt = Integer.parseInt(tempStr);
                while (tempInt > 0){
                    sum2 += tempInt % 10;
                    tempInt /= 10;
                }
            }else{
                sum2 += Integer.parseInt(tempStr);
            }
        }

        return sum - sum2;
    }
}
