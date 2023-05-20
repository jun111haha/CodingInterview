package leetcode.easy.solved;

import java.util.HashMap;

public class easy771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i=0; i<stones.length(); i++){
            hashMap.put(stones.charAt(i), hashMap.getOrDefault(stones.charAt(i), 0) + 1);
        }

        for(int i=0; i<jewels.length(); i++){
            if(hashMap.get(jewels.charAt(i)) != null){
                ans += hashMap.get(jewels.charAt(i));
            }
        }

        return ans;
    }

}
