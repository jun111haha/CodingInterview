package LeetCode.solved.easy;

import java.math.BigInteger;

public class problem67 {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
    public static String addBinary(String a, String b) {
        BigInteger bigInteger1 = new BigInteger(a, 2);
        BigInteger bigInteger2 = new BigInteger(b, 2);

        BigInteger sum = bigInteger1.add(bigInteger2);
        String answer = sum.toString(2);
        return answer;
    }
}
