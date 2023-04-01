package leetcode.easy.solved;

public class easy112 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }

            if(ans < prices[i] - min){
                ans = prices[i] - min;
            }
        }

        return ans;
    }
}
