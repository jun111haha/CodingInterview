package LeetCode.DP;

public class dp121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxStock = 0;

        for(int i=0; i<prices.length; i++){
            min = Math.min(min, prices[i]);
            maxStock = Math.max(maxStock, prices[i] - min);
        }

        return maxStock;
    }
}
