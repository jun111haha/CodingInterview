package leetcode.easy.solved;

public class easy121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int answer = 0;
        for(int i=0; i<prices.length; i++){
            min = Math.min(min, prices[i]);
            answer = Math.max(answer, prices[i] - min);
        }

        return answer;
    }
}
