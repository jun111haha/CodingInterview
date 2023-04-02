package leetcode.easy.solved;

import java.util.HashMap;
import java.util.Map;

public class easy13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int len = s.length();
        int ans = hashMap.get(s.charAt(len - 1));
        for(int i=len-2; i>=0; i--){
            if(hashMap.get(s.charAt(i)) >= hashMap.get(s.charAt(i + 1))){
                ans+= hashMap.get(s.charAt(i));
            }else{
                ans-= hashMap.get(s.charAt(i));
            }
        }



        return ans;
    }

}
