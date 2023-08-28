package programmers;

import java.util.HashSet;

public class 폰켓몬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3}));
    }


    public static int solution(int[] nums) {
        int answer = 0;
        int len = nums.length / 2;

        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hashSet.add(nums[i]);
        }

        answer = Math.min(len, hashSet.size());

        return answer;
    }
}
