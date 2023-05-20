package leetcode.easy.solved;

import java.util.Arrays;

public class easy1672 {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{
                {1,2,3},
                {3,2,1}
        }));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0; i<accounts.length; i++){
            int temp = 0;
            for(int j=0; j<accounts[i].length; j++){
                temp += accounts[i][j];
                if(max < temp){
                    max = temp;
                }
            }

        }

        return max;
    }
}
