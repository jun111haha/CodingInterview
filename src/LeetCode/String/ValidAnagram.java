package LeetCode.String;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("ab", "a"));

    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] chars = s.toCharArray();
        char[] chars2 = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars2);
        String str1 = new String(chars);
        String str2 = new String(chars2);

        return (str1.equals(str2)) ? true : false;

    }
}
