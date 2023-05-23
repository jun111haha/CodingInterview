package leetcode.easy.solved;

public class easy1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            sum += rem;
            prod *= rem;
            n /= 10;
        }

        return prod-sum;
    }
}
