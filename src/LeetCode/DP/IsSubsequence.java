package LeetCode.DP;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));

    }
    // two pointer 전략
    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;

        int i = 0;
        for(int j =0; j<t.length(); j++){
            if(s.charAt(i) == t.charAt(j)){
                if(++i == s.length()) return true;
            }
        }
        return false;
    }
}
