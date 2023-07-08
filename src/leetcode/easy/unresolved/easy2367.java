package leetcode.easy.unresolved;

import java.util.HashSet;
import java.util.Set;

public class easy2367 {
    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[]{0,1,4,6,7,10}, 3));
    }
    public static int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if (set.contains(i - diff) && set.contains(i - diff * 2)) {
                ++ans;
            }
            set.add(i);
        }

        return ans;
    }
}
