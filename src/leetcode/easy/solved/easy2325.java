package leetcode.easy.solved;

import java.util.Arrays;
import java.util.HashMap;

public class easy2325 {
    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog",
                "vkbs bs t suepuv"));
    }

    public static String decodeMessage(String key, String message) {
        StringBuilder ans = new StringBuilder();
        key = key.replaceAll(" ","");

        char al = 'a';
        HashMap<Character, Character> hashMap = new HashMap<>();

        for(int i=0; i<key.length(); i++){
            if(!hashMap.containsKey(key.charAt(i))){
                hashMap.put(key.charAt(i), al++);
            }
        }

        for(int i=0; i<message.length(); i++){
            if(hashMap.containsKey(message.charAt(i))){
                ans.append(hashMap.get(message.charAt(i)));
            }else{
                ans.append(message.charAt(i));
            }
        }

        System.out.println(hashMap);

        return ans.toString();
    }

}
