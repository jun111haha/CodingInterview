package leetcode.easy.solved;

import java.util.ArrayList;

public class easy1 {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{3,2,4}, 6));
    }

    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] +  nums[j] == target){
                    list.add(i);
                    list.add(j);
                    break;
                }
            }
        }

        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
