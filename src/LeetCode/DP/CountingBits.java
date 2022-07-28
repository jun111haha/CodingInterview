package LeetCode.DP;

public class CountingBits {
    public static void main(String[] args) {
        for(int i : countBits(5)){
            System.out.println(i);
        }
    }

    public static int[] countBits(int n) {
        int [] answer = new int[n + 1];
        for(int i=1; i<=n; i++){
            answer[i] = (Integer.bitCount(i));
        }

        return answer;
    }
}
