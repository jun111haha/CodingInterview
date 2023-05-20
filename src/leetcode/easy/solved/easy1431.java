package leetcode.easy.solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class easy1431 {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxCandy = 0 ;
        for(int candy: candies) {
            if(candy > maxCandy) {
                maxCandy = candy;
            }
        }

        for(int i : candies){
            if(i + extraCandies >= maxCandy){
                list.add(true);
            }else{
                list.add(false);
            }
        }

        return list;
    }
}
