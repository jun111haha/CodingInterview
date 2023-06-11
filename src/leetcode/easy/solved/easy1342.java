package leetcode.easy.solved;

public class easy1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));

    }
    public static int numberOfSteps(int num) {
        int ans = 0;

        while (num > 0){
            ans++;
            num = ((num & 1) != 0) ? num - 1 : num >> 1;
        }


        return ans;
    }
}
