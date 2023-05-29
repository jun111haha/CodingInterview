package leetcode.easy.solved;


public class easy1528 {
    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }

    public static String restoreString(String s, int[] indices) {
        String ans = "";
        char[] chars = new char[s.length()];

        for(int i=0; i<indices.length; i++){
            chars[indices[i]] = s.charAt(i);
        }

        for(char c : chars){
            ans += c;
        }

        return ans;
    }

}
