package leetcode.easy.solved;

public class easy14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for(int i=1; i<strs.length; i++){
            System.out.println(strs[i].indexOf(ans));
            while (strs[i].indexOf(ans) != 0){
                ans = ans.substring(0, strs.length - 1);
            }
        }

        return ans;
    }
}