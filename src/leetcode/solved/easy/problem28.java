package leetcode.solved.easy;

public class problem28 {
    public static void main(String[] args) {
        problem28 problem28 = new problem28();
        System.out.println(problem28.strStr("leetcode", "leeto"));
    }
    public int strStr(String haystack, String needle) {

        if(needle.equals("")){
            return 0;
        }

        return haystack.indexOf(needle);
    }
}
