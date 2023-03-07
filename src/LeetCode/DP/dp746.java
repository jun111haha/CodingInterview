package LeetCode.DP;

public class dp746 {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        for(int i=2; i<len; i++){
            cost[i]= Math.min(cost[i - 1] , cost[i - 2]) + cost[i];
        }

        return Math.min(cost[len - 1], cost[len - 2]);
    }
}
