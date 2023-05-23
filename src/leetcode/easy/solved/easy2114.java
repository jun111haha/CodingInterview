package leetcode.easy.solved;

public class easy2114 {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<sentences.length; i++){
            var stringArr = sentences[i].split(" ");
            int tempLen = stringArr.length;
            if(tempLen > max){
                max = tempLen;
            }
        }

        return max;
    }
}
