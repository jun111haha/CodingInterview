package leetcode.easy.solved;

public class easy1662 {
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean isCheck = false;
        String strWord1 = "";
        String strWord2 = "";

        for(String s : word1){
            strWord1 += s;
        }

        for(String s : word2){
            strWord2 += s;
        }

        if(strWord1.equals(strWord2)){
            isCheck = true;
        }

        return isCheck;
    }
}
