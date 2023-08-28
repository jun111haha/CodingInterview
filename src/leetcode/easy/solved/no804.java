package leetcode.easy.solved;

import java.util.HashMap;
import java.util.HashSet;

public class no804 {
    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] strArr = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character, String> hashMap1 = new HashMap<>();

        int index = 0;
        for(int i='a'; i<='z'; i++){
            hashMap1.put((char) i, strArr[index]);
            index++;
        }

        HashSet<String> hashSet = new HashSet<>();
        for(int i=0; i<words.length; i++){
            String temp = words[i];
            String joiningTemp = "";
            for(int j=0; j<temp.length(); j++){
                joiningTemp += hashMap1.get(temp.charAt(j));
            }
            hashSet.add(joiningTemp);
        }

        return hashSet.size();
    }
}
