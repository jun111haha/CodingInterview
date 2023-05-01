package leetcode.easy.solved;

import java.util.Arrays;

public class easy242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        String s1 = new String(sChar);
        String s2 = new String(tChar);

        return s1.equals(s2) ? true : false;
    }
}
