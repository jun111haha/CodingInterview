package leetcode.easy.solved;


import java.util.ArrayList;
import java.util.Arrays;

public class easy1389 {
    public static void main(String[] args) {
        System.out.println(createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }


        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}
