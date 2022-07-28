package LeetCode.DP;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int [] arr = {10,15,20};
        System.out.println(minCostClimbingStairs(arr));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] arr = new int[cost.length];
        arr[0] = cost[0];
        arr[1] = cost[1];

        for(int i=2; i<cost.length; i++){
            arr[i] = Math.min(arr[i - 1], arr[i - 2]) + cost[i];
        }

        int last = cost.length - 1;
        return Math.min(arr[last] , arr[last - 1]);
    }
}
