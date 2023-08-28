package leetcode.easy.solved;

import java.util.HashMap;

public class no2006 {
    public static void main(String[] args) {
        System.out.println(countKDifference(new int[]{3,2,1,5,4}, 2));
    }

    public static int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int ans = 0;

        for(int i=0; i<nums.length; i++){
            if(hashMap.containsKey(nums[i] - k)){
                ans+= hashMap.get(nums[i] - k);
            }

            if(hashMap.containsKey(nums[i] + k)){
                ans+= hashMap.get(nums[i] + k);
            }

            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        System.out.println(hashMap);
        return ans;
    }
}
