package LeetCode.Array;

import java.util.HashSet;

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));

    }
    /*
    * 중복 허용하지않는 Set 활용
    * 값이 존재하면 true, 값이 존재하지 않으면 false
    * */
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int num : nums){
            if(hashSet.contains(num)){
                return true;
            }else{
                hashSet.add(num);
            }
        }

        return false;
    }
}
