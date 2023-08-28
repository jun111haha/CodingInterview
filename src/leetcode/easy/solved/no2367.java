package leetcode.easy.solved;

import java.util.HashSet;

public class no2367 {
    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[]{0,1,4,6,7,10}, 3));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;

        HashSet<Integer> hashSet = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }

        System.out.println(hashSet);

        int i = 0;
        int j = 1;
        while (i<=j && j<nums.length){

            if(nums[j] - nums[i] < diff){
                j++;
            }else if (nums[j] - nums[i] > diff){
                i++;
            }else{
                if(hashSet.contains(nums[j] + diff)){
                    ans++;
                }
                i++;
                j++;
            }

        }
        return ans;
    }
}
