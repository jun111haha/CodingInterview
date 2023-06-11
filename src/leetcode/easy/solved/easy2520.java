package leetcode.easy.solved;

public class easy2520 {
    public static void main(String[] args) {
        System.out.println(countDigits(7));
    }

    public static int countDigits(int num) {
        int ans = 0;
        int n = num;
        while (n > 0){
            if(num % (n % 10) == 0){
                ans++;
            }
            n /= 10;
        }

        return ans;
    }
}
