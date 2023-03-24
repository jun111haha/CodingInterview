package leetcode.easy.unresolved;

import java.util.ArrayList;
import java.util.List;

public class problem2200 {
    public static void main(String[] args) {
        System.out.println(findKDistantIndices(new int[]{3,4,9,1,3,9,5}, 9, 1));
    }

    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        List<Integer> keyIndex=new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] == key){
                keyIndex.add(i);
            }
        }

        for(int i=0; i<nums.length; i++){
            for(int j:keyIndex){
                if(Math.abs(i-j) <= k){
                    list.add(i);
                    break;
                }
            }
        }

        return list;
    }
}
