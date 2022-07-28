package LeetCode.Array;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int [] list = {7,1,5,3,6,4};
        System.out.println(maxProfit(list));

    }
    /*
    https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    1.한번만 사고 팔수 있음.
    2.구해야할 최대값은 오늘가격 - 장중에 최소가격 의 최대값
    3.min 에는 최소가격을 구하고, maxProfit 에는 해당날에 최소가격을 뺀 가격
    * */
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            min = Math.min(min, price);
            maxProfit = Math.max(maxProfit, price - min);
        }
        return maxProfit;
    }
}
