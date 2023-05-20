package leetcode.easy.solved;

public class easy2011 {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i=0; i<operations.length; i++){
            x += (44 - operations[i].charAt(i));
        }

        return x;
    }
}
