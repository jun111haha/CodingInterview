package LeetCode.String;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
        s = s.toLowerCase();
        s = s.replaceAll(match, "");
        s = s.replaceAll(" ", "");

        StringBuffer sb = new StringBuffer(s);
        String reverse = sb.reverse().toString();

        if(reverse.equals(s)){
            return true;
        }else {
            return false;
        }
    }
}
