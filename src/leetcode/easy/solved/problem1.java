package leetcode.easy.solved;

import java.util.ArrayList;

public class problem1 {
    public static void main(String[] args) {
        problem1 easy1 = new problem1();
        System.out.println(easy1.twoSum(new int[]{3,2,4}, 6));
    }

    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    list.add(i);
                    list.add(j);
                    break;
                }
            }
        }

        int[] arr = new int[list.size()];
        int size = 0;
        for(int i : list){
            arr[size++] = i;
        }

        return arr;
    }
}
