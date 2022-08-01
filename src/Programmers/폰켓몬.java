package Programmers;

import java.util.HashSet;

public class 폰켓몬 {
    public static void main(String[] args) {
        int [] nums = {3,1,2,3};
        System.out.println(solution(nums));

    }

    // 중복을 제거한 셋의 크기가 max보다 크면 max를 리턴 작으면 hashSet size를 리턴
    public static int solution(int[] nums) {
        int max  = nums.length / 2;

        HashSet<Integer> hashSet = new HashSet<>();
        for(int i =0; i<nums.length; i++){
            hashSet.add(nums[i]);
        }

       return hashSet.size() > max ? max : hashSet.size();
    }
}
