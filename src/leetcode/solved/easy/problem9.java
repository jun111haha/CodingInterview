package leetcode.solved.easy;

public class problem9 {
    public static void main(String[] args) {
        problem9 problem9 = new problem9();
        System.out.println(problem9.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        boolean isCheck = false;
        StringBuffer sb = new StringBuffer(String.valueOf(x));
        String temp = sb.reverse().toString();

        if(temp.equals(String.valueOf(x))){
           isCheck = true;
        }

        return isCheck;
    }
}
