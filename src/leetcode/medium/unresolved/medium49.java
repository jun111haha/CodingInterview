package leetcode.medium.unresolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class medium49 {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return answer;
        }
        if (strs.length == 1) {
            answer.add(Arrays.asList(strs));
            return answer;
        }

        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String tempStr = new String(ch);

            if(!hashMap.containsKey(tempStr)){
                hashMap.put(tempStr, new ArrayList<String>());
            }
            hashMap.get(tempStr).add(str);
        }


        return new ArrayList<>(hashMap.values());
    }
}
