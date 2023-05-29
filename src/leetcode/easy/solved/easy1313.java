package leetcode.easy.solved;

import java.util.ArrayList;

public class easy1313 {
    public static void main(String[] args) {
        System.out.println(decompressRLElist(new int[]{1,2,3,4}));
    }

    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i % 2 == 0){
                for(int j=0; j<nums[i]; j++){
                    list.add(nums[i + 1]);
                }
            }
        }

        System.out.println(list);
        var ans = new int[list.size()];
        return ans;
    }
}
