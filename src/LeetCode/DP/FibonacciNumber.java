package LeetCode.DP;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    public static int fib(int n) {
//        if(n == 0) return 0;
//        if(n == 1) return 1;
//
//
//       return fib(n - 1) + fib(n - 2);
        int [] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i =2; i<arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}
